public class MyMail {

    public static final String POP3_SERVER = "127.0.0.1";

    public static final int POP3_PORT = 110;

    public static final String POP3_USER = "user1";

    public static final String POP3_PASS = "user1";


    public static void main( String[] args ) {
        new MyMail();
        //new MyMail("pop3.neugebauer.cc", 110, "informatik@neugebauer.cc", "ifq2_user1");
    }

    private String ip;

    private int port;

    private Connection con;

    private MyMailGUI gui;

    private String user;

    private String password;

    private String lastError;

    /**
     * Verbindet zu einem lokalen POP3-Server.
     */
    public MyMail() {
        this(POP3_SERVER, POP3_PORT, POP3_USER, POP3_PASS);
    }

    public MyMail( String pIP, String pUser, String pPassword ) {
        this(pIP, 110, pUser, pPassword);
    }

    public MyMail( String pIP, int pPort, String pUser, String pPassword ) {
        ip = pIP;
        port = pPort;
        user = pUser;
        password = pPassword;

        // GUI erstellen und Status setzen.
        gui = new MyMailGUI(this);
        gui.setStatus("App gestartet");
    }

    /**
     * Stellt die Verbindung zum POP3-Server her.
     * <p>
     * Erstellt ein {@link Connection}-Objekt für die Verbindung zum Server
     * mit der IP {@link #ip} und dem Port {@link #port}. Laut RFC1939 sendet
     * der POP3-Server als Erstes eine Begrüßungsnachricht zur Bestätigung der
     * Verbindung:
     *
     * <blockquote>
     * Once the TCP connection has been opened by a POP3 client, the POP3
     * server issues a one line greeting.  This can be any positive
     * response.  An example might be:
     * S:  +OK POP3 server ready
     * </blockquote>
     * <p>
     * Gibt es beim Verbindungsaufbau einen Fehler, gibt die Methode {@code false}
     * zurück und setzt {@link #lastError} auf eine sinnvolle Fehlermeldung.
     * <p>
     * Das {@code Connection}-Objekt wird in {@link #con} gespeichert.
     *
     * @return {@code true} oder {@code false}
     * @link https://datatracker.ietf.org/doc/html/rfc1939#section-4
     */
    private boolean connectToServer() {
        con = new Connection(ip, port);

        // Begrüssungsnachricht des Servers empfangen und prüfen
        String mes = con.receive();
        if( mes == null || mes.startsWith("-ERR") ) {
            // Keine "positive response" :-(
            // Setze einen Fehler und gib "false" zurück.
            lastError = "Der POP3-Server reagiert nicht!";
            return false;
        }

        // Verbindung erfolgreich
        return true;
    }

    /**
     * Authentifiziert den Nutzer beim POP3-Server.
     * <p>
     * Die Methode nutzt die {@code USER} / {@code PASS} Befehle zur
     * Anmeldung mit dem {@link #user} und {@link #password}. Sie erwartet, dass
     * zuvor erfolgreich eine Verbindung mit {@link #connectToServer()}
     * hergestellt wurde.
     * <p>
     * Hat die Anmeldung Erfolg, wird {@code true} zurückgegeben. Andernfalls
     * {@code false} und {@link #lastError} wird auf eine sinnvolle Fehler-
     * meldung gesetzt.
     *
     * @return {@code true} oder {@code false}
     * @link https://datatracker.ietf.org/doc/html/rfc1939#page-13
     */
    private boolean login() {
        String mes = ""; // Speicher für die Antworten des Servers

        // USER Kommando senden und Antwort prüfen
        con.send("USER " + user);
        mes = con.receive();  // Auf Antwort warten, "+OK" erwartet
        if( mes == null || mes.startsWith("-ERR") ) {
            lastError = "Benutzername nicht akzeptiert!";
            return false;
        }

        // PASS Kommando senden und Antwort prüfen
        con.send("PASS " + password);
        mes = con.receive();  // Auf Antwort warten, "+OK" erwartet
        if( mes == null || mes.startsWith("-ERR") ) {
            lastError = "Falsches Passwort!";
            return false;
        }

        // Anmeldung war erfolgreich
        return true;
    }

    /**
     * Ermittelt die Anzahl an Nachrichten auf dem Server.
     * <p>
     * Die Methode erwartet, dass zuvor erfolgreich eine Verbindung mit
     * {@link #connectToServer()} hergestellt wurde und nutzt dann den
     * {@code STAT} Befehl, um die Anzahl der Mails zu ermitteln.
     * <p>
     * Gibt der Abfrage einen Fehler, gibt die Methode {@code -1}
     * zurück und setzt {@link #lastError} auf eine sinnvolle Fehlermeldung.
     *
     * @return Die Anzahl an Mails auf dem Server oder {@code -1}.
     * @link https://datatracker.ietf.org/doc/html/rfc1939#page-6
     */
    public int getMessageCount() {
        String mes = "";

        // Statistik abfragen
        con.send("STAT");
        mes = con.receive();
        if( mes == null || mes.startsWith("-ERR") ) {
            lastError = "Fehler bei der STAT Anfrage.";
            return -1;
        }

        // Anzahl Mails "ausschneiden" und in Integer umwandeln
        int firstSpace = mes.indexOf(' '); // 1. Leerzeichen finden
        int secondSpace = mes.indexOf(' ', firstSpace + 1); // 2. Leerzeichen fidnen
        int mailCount = Integer.parseInt(mes.substring(firstSpace + 1, secondSpace));

        return mailCount;
    }

    /**
     * Ruft alle vorhandenen Mails vom Server ab und fügt sie der {@link #gui}
     * hinzu.
     *
     * Die Methode wird aufgerufen, sobald der Nutzer in der GUI den "Neu laden"
     * Button anklickt.
     *
     * Die Methode leert die GUI komplett und ruft dann <em>alle</em> vorhandenen
     * Mails vom Server ab. Sollte dabei ein Fehler auftreten, wird eine
     * entsprechende Fehlermeldung in der GUI angezeigt. Als Information für
     * den Nutzer können auch sinnvolle Statusmeldungen angezeigt werden.
     *
     * @see MyMailGUI#setError(String)
     * @see MyMailGUI#setStatus(String)
     */
    public void getAllMails() {
        gui.setStatus("Rufe Mails vom Server ab..");
        gui.clearAllMails(); // Gui leeren
        lastError = null;    // Zu Beginn gibt es noch keinen Fehler

        // Verbindung erstellen und prüfen
        boolean connected = connectToServer();
        if( !connected ) {
            // Letzten Fehler anzeigen (wird in connectToServer gesetzt).
            gui.setError(lastError);
            return; // Abbrechen
        }

        // Anmeldung durchführen und prüfen
        // Hinweis: Nutze die login() Methode
        if( !login() ) {
            gui.setError(lastError);
            return;
        }

        // Anzahl Mails auf dem Server abfragen
        int mailCount = getMessageCount();

        // Abruf der Mails nach fortlaufender Nummer
        for( int i = 1; i <= mailCount; i++ ) {
            Mail nextMail = getMail(i);
            if( nextMail != null ) {
                gui.setStatus("Mail " + nextMail.getSubject() + " abgerufen.");
                gui.addMailToList(nextMail);
            }
        }

        // Verbindung beenden
        con.send("QUIT");
        con.close();

        if( lastError != null ) {
            // Es gab einen Fehler
            gui.setError(lastError);
        } else {
            // Kein Fehler
            gui.setStatus("Liste der Mails erfolgreich geladen.");
        }
    }

    /**
     * Ruft die Mail mit der Nummer <var>pNumber</var> vom Server ab und
     * gibt sie als {@link Mail}-Objekt zurück.
     * <p>
     * Die Methode erwartet, dass zuvor erfolgreich eine Verbindung mit
     * {@link #connectToServer()} hergestellt wurde.
     * <p>
     * Tritt ein Fehler auf, gibt die Methode {@code null} zurück und setzt
     * {@link #lastError} auf eine sinnvolle Nachricht.
     *
     * @param pNumber Die Nummer einer E-Mail auf dem Server
     * @return Ein Mail-Objekt oder {@code null}.
     */
    public Mail getMail( int pNumber ) {
        String mes = ""; // Speicher für Antworten des Servers

        // Prüfen, ob es eine Mail mit der Nummer pNumber gibt
        int mailCount = getMessageCount();
        if( mailCount < pNumber ) {
            lastError = "Nicht genug Mails auf dem Server.";
            return null;
        }

        // Mail abrufen (RETR)
        con.send("RETR " + pNumber);
        mes = con.receive();
        if( mes == null || mes.startsWith("-ERR") ) {
            lastError = "Fehler beim Empfangen der Mail.";
            return null;
        }

        String text = "";
        String subject = "", from = "", date = "";
        int bytes = 0;
        boolean inBody = false;
        while( !mes.equals(".") ) {
            if( inBody ) {
                if( mes.length() > 0 && mes.charAt(0) == '.' ) {
                    mes = mes.substring(1);
                }
                text += mes + "\n";
            } else if( mes.startsWith("Subject:") ) {
                subject = mes.substring(9);
            } else if( mes.startsWith("From:") ) {
                from = mes.substring(6);
            } else if( mes.startsWith("Date:") ) {
                date = mes.substring(6);
            } else if( mes.length() == 0 ) {
                inBody = true;
            } else if( mes.equals('.') ) {
                inBody = false;
            }
            mes = con.receive();
        } // end of while

        return new Mail(pNumber, date, from, subject, text);
    }

    /**
     * Löscht eine Mail vom Server.
     * <p>
     * Die Methode stellt eine Verbindung zum Server her, markiert die
     * übergebene Mail als gelöscht und beendet die Verbindung.
     * <p>
     * Tritt ein Fehler auf, bricht die Methode ab und setzt
     * den Status der GUI auf eine sinnvolle Fehlermeldung.
     *
     * <b>Achtung</b>: Es wird die Mail mit derselben Nummer wie <var>pMail</var>
     * gelöscht. Es wird nicht garantiert, dass dies auch dieselbe Mail ist.
     *
     * @param pMail Das Mailobjekt, das gelöscht werden soll.
     * @todo Vor Löschen prüfen, ob die Mail auf dem Server dieselbe wie pMail ist.
     */
    public void deleteMail( Mail pMail ) {
        // Verbindung erstellen und prüfen
        if( !connectToServer() ) {
            gui.setError(lastError);
            return;
        }

        // Anmeldung durchführen und prüfen
        if( !login() ) {
            gui.setError(lastError);
            return;
        }

        // Prüfen, ob eine Mail mit der Nummer vorhanden ist
        // Hinweis: Die Nummer der Mail ist über pMail.getNumber() abrufbar
        int mailCount = getMessageCount();
        if( mailCount < pMail.getNumber() ) {
            gui.setError("Keine passende Mail auf dem Server!");
            return;
        }

        // Mail als gelöscht markieren
        con.send("DELE " + pMail.getNumber());
        String mes = con.receive();
        if( mes == null || mes.startsWith("-ERR") ) {
            gui.setError("Konnte die Mail nicht löschen!");
            return;
        }

        // Löschung ausführen und Verbindung beenden.
        con.send("QUIT");
        con.close();

        // Mail aus der GUI entfernen und neu aufbauen.
        gui.removeMailFromList(pMail);
    }

}
