import java.util.Random;

/**
 * Das ArrayDojo Projekt ist eine Sammlung unzusammenhängender Übungen zur
 * Programmierung mit Arrays.
 *
 *
 * Im Kommentar jeder Methode steht eine Beschreibung des Problems, das in der
 * Methode gelöst werden soll. Die Klasse {@link ArrayDojoTest} enthält
 * Testmethoden, die prüfen, ob die Methode korrekt implementiert wurde. Die
 * Tests können in BlueJ mit einem Rechtsklick auf die Testklasse gestartet
 * werden.
 *
 * Du kannst die Methoden in beliebiger Reihenfolge implementieren. Such
 * dir also die für dich interessantesten heraus.
 *
 * Einige Methoden sind schon vollständig implementiert, und können
 * als Beispiel dienen. Die Methoden {@link #printArray(int[])},
 * {@link #printArray(String[])} und {@link #printArray(boolean[])}
 * geben ein Array auf der Kommandozeile aus und können bei der Fehlersuche
 * helfen. Denke auch daran, den Debugger zu nutzen.
 *
 * TODO:
 * Implementiere die Methoden nach der Beschreibung im jeweiligen
 * Kommentar. Teste deine Umsetzungen regelmäßig mit den Test-Methoden
 * in der Klasse {@link ArrayDojoTest}.
 */
public class ArrayDojo {

    /**
     * Interner Zufallsgenerator
     *
     * Erstelle Zufallszahlen mit {@link Random#nextInt(int)}.
     *
     * <code>zufall.nextInt(100)</code> erzeugt zum Beispiel eine
     * Zufallszahl zwischen 0 (inklusive) und 100 (exklusive).
     *
     * Eine Zufallszahl zwischen <code>min</code> und <code>max</code>
     * kannst du mit <code>zufall.nextInt(max-min)+min</code> erzeugen.
     */
    private Random rand;

    /**
     * Konstruktor der Klasse ArrayDojo.
     */
    public ArrayDojo() {
        // Neuen Zufallsgenerator erstellen
        rand = new Random();
    }

    /**
     * Ermittelt die Länge eines String-Arrays.
     *
     * @param pArray Ein Array mit Strings.
     * @return Die Länge des Arrays.
     */
    public int getLength( String[] pArray ) {
        return 0;
    }

    /**
     * Gibt immer <b>das erste Element</b> eines Zahlenarrays zurück.
     *
     * Es darf angenommen werden, dass das Array immer mindestens ein Element
     * hat.
     *
     * @param pArray Ein Array mit Zahlen.
     * @return Die erste Zahl im Array.
     */
    public int getFirst( int[] pArray ) {
        return 0;
    }

    /**
     * Gibt immer <b>das zweite Element</b> eines Zahlenarrays zurück.
     *
     * Es darf angenommen werden, dass das Array immer mindestens zwei Elemente
     * hat.
     *
     * @param pArray Ein Array mit Zahlen.
     * @return Die zweite Zahl im Array.
     */
    public int getSecond( int[] pArray ) {
        return 0;
    }

    /**
     * Gibt immer <b>das letzte Element</b> eines Zahlenarrays zurück.
     *
     * Für ein leeres Array wird 0 zurückgegeben.
     *
     * @param pArray Ein Array mit Zahlen.
     * @return Die letzte Zahl im Array oder <code>0</code>.
     */
    public int getLast( int[] pArray ) {
        return 0;
    }


    /**
     * Gibt das Element am Index <var>pIndex</var> eines String-Arrays zurück.
     * Gibt es kein Element am angegebenen Index (weil das Array weniger
     * Elemente enthält oder leer ist), dann wird <code>null</code> zurückgegeben.
     *
     * @param pArray Ein Array mit Strings.
     * @return Der String mit dem passenden Index oder <code>null</code>.
     */
    public String getValue( String[] pArray, int pIndex ) {
        return null;
    }


    /**
     * Gibt das Element an Stelle <var>pNumber</var> eines String-Arrays zurück.
     * Also: 1 = erstes Element, 2 = zweites Element, ...
     *
     * Gibt es kein Element mit der angegebenen Nummer (weil das Array weniger
     * Elemente enthält oder leer ist), dann wird <code>null</code> zurückgegeben.
     *
     * @param pArray Ein Array mit Strings.
     * @return Der String mit dem passenden Nummer oder <code>null</code>.
     */
    public String getElement( String[] pArray, int pNumber ) {
        return null;
    }

    /**
     * Setzt das erste Element eines Arrays auf <var>pValue</var> und gibt
     * das veränderte Array zurück.
     *
     * Hat das Array die Länge <code>0</code>, dann wird das Array nicht
     * verändert.
     *
     * @param pArray Ein Array mit Zahlen.
     * @param pValue Der neue Wert für das erste Element.
     * @return Das Array mit dem veränderten ersten Wert.
     */
    public int[] setFirst( int[] pArray, int pValue ) {
        return null;
    }

    /**
     * Erstellt ein Integer-Array mit <var>pNumberOfElements</var>
     * zufällig gewählten Zahl-Elementen im Bereich <var>pMin</var>
     * bis <var>pMax</var> (Obere und untere Grenze eingeschlossen).
     *
     * Wird ein negativer Wert für die Anzahl Elemente angegeben,
     * dann wird ein leeres Array zurückgegeben.
     *
     * Es darf angenommen werden, dass <code>pMax >= pMin</code> gilt.
     *
     * @see #getRandomInt(int, int)
     */
    public int[] generateIntArray( int pNumberOfElements, int pMin, int pMax ) {
        return null;
    }

    /**
     * Erzeugt eine Zufallszahl zwischen <var>pMin</var>
     * und <var>pMax</var> (exklusive).
     */
    private int getRandomInt( int pMin, int pMax ) {
        return rand.nextInt(pMax - pMin) + pMin;
    }

    /**
     * Erstellt ein String-Array mit <var>pNumberOfElements</var>
     * Text-Elementen der Form <code>String 1</code>, <code>String 2</code>, ...
     *
     * Wird ein negativer Wert für die Anzahl Elemente angegeben,
     * dann wird ein leeres Array zurückgegeben.
     */
    public String[] generateStringArray( int pNumberOfElements ) {
        return null;
    }

    /**
     * Erstellt ein Boolean-Array mit <var>pNumberOfElements</var>
     * zufällig gewählten Wahrheitswerten.
     *
     * Wird ein negativer Wert für die Anzahl Elemente angegeben,
     * dann wird ein leeres Array zurückgegeben.
     *
     * @see Random#nextBoolean()
     */
    public boolean[] generateBooleanArray( int pNumberOfElements ) {
        if( pNumberOfElements < 1 ) {
            return new boolean[0];
        }
        boolean[] result = new boolean[pNumberOfElements];
        for( ; pNumberOfElements > 0; pNumberOfElements-- ) {
            result[pNumberOfElements - 1] = rand.nextBoolean();
        }
        return result;
    }

    /**
     * Sucht in einem Array mit Zahlen das kleinste Element.
     *
     * Für ein leeres Array wird <code>0</code> zurückgegeben.
     */
    public int min( int[] pArray ) {
        if( pArray.length == 0 ) {
            return 0;
        }

        int min = pArray[0];
        for( int i = 1; i < pArray.length; i++ ) {
            if( pArray[i] < min ) {
                min = pArray[i];
            }
        }
        return min;
    }

    /**
     * Sucht in einem Array mit Zahlen das größte Element.
     *
     * Für ein leeres Array wird <code>0</code> zurück gegeben.
     */
    public int max( int[] pArray ) {
        return 0;
    }

    /**
     * Berechnet die Summe aller Elemente in einem Array mit Zahlen.
     *
     * Für ein leeres Array wird <code>0</code> zurück gegeben.
     */
    public int sum( int[] pArray ) {
        return 0;
    }

    /**
     * Berechnet den Mittelwert (average) eines Arrays mit Zahlen.
     *
     * Für ein leeres Array wird <code>0</code> zurückgegeben.
     *
     * <b>Tipp:</b> Implementiere zunächst {@link #sum(int[])}.
     */
    public double avg( int[] pArray ) {
        return 0;
    }

    /**
     * Prüft, ob <b>alle</b> Elemente in einem Array von Wahrheitswerten
     * <code>true</code> sind. Sonst wird <code>false</code> zurückgegeben.
     *
     * Für ein leeres Array wird <code>false<code> zurückgegeben.
     */
    public boolean and( boolean[] pArray ) {
        // Leeres Array (Länge 0) gibt false zurück
        if( pArray.length == 0 ) {
            return false;
        }

        // Array mit Zählschleife durchlaufen
        for( int i = 0; i < pArray.length; i++ ) {
            // Bei erstem false wird abgebrochen und false zurückgegeben
            if( !pArray[i] ) {
                return false;
            }
        }
        // Wenn wir hier ankommen, dann gab es im Array kein false
        return true;
    }

    /**
     * Prüft, ob <b>mindestens ein</b> Element in einem Array von
     * Wahrheitswerten <code>true</code> ist. Sonst wird
     * <code>false</code> zurückgegeben.
     *
     * Für ein leeres Array wird <code>false<code> zurückgegeben.
     */
    public boolean or( boolean[] pArray ) {
        return true;
    }

    /**
     * Prüft, ob <b>genau ein</b> Element in einem Array von
     * Wahrheitswerten <code>true</code> ist. Sonst wird
     * <code>false</code> zurückgegeben. (Also bei keinmal <code>true</code>
     * oder mehr als einmal <code>true</code>.)
     *
     * Für ein leeres Array wird <code>false<code> zurückgegeben.
     */
    public boolean xor( boolean[] pArray ) {
        return true;
    }

    /**
     * Erzeugt aus einem String-Array einen einzelnen String, in dem alle
     * Elemente des Arrays hintereinander verknüpft sind.
     *
     * Aus <code>{"String 1","String 2"}</code> wird <code>"String 1String 2"</code>.
     *
     * Für ein leeres Array wird ein leerer String zurückgegeben.
     *
     * <b>Hinweis:</b> Der <code>+</code> Operator verknüpft zwei Strings miteinander:
     * <code>"Foo" + "Bar"</code> ergibt <code>"FooBar"</code>.
     */
    public String concat( String[] pArray ) {
        return "";
    }

    /**
     * Erzeugt aus einem String-Array einen einzelnen String, in dem alle
     * Elemente des Arrays durch <var>pSep</var> getrennt miteinander
     * verknüpft  sind.
     *
     * Aus <code>{"String 1","String 2"}</code> wird mit
     * <code>pSep = ";"</code> zum Beispiel <code>"String 1;String 2"</code>.
     *
     * Für ein leeres Array wird ein leerer String zurückgegeben.
     */
    public String join( String[] pArray, String pSep ) {
        return "";
    }

    /**
     * Setzt vor jedes Element in einem String-Array das Prefix
     * <var>pPrefix</var> und gibt das Array mit den veränderten Werten zurück.
     *
     * Aus <code>{"String 1","String 2"}</code> wird mit
     * <code>pPrefix = "prefix"</code> zum Beispiel
     * <code>{"prefixString 1","prefixString 2"}</code>.
     */
    public String[] prefix( String[] pArray, String pPrefix ) {
        return null;
    }

    /**
     * Erstellt ein neues String-Array, in dem die Elemente aus
     * <var>pArray</var> in umgekehrter Reihenfolge vorkommen.
     *
     * Aus <code>{"String 1","String 2"}</code> wird zum Beispiel
     * <code>{"String 2","String 1"}</code>.
     */
    public String[] reverse( String[] pArray ) {
        return null;
    }

    /**
     * Zählt, wie viele Elemente in einem Array mit Zahlen größer als
     * <var>pValue</var> sind.
     *
     * Für das Array <code>{1,2,3,4,5}</code> und
     * <code>pValue = 3</var> wäre das Ergebnis dann
     * <code>2</code>.
     *
     * Für ein leeres Array wird 0 zurück gegeben.
     */
    public int over( int[] pArray, int pValue ) {
        return 0;
    }

    /**
     * Erstellt ein Integer-Array mit den ersten <var>pNumberOfElements</var>
     * Fibonacci-Zahlen.
     *
     * Die ersten sechs Fibonacci-Zahlen sind: 1,1,2,3,5,8,...
     *
     * (Wenn du nicht weißt, was die Fibonacci-Zahlen sind hilft Wikipedia.)
     *
     * Wird ein negativer Wert für die Anzahl Elemente angegeben,
     * dann wird ein leeres Array zurück gegeben.
     */
    public int[] generateFibonacci( int pNumberOfElements ) {
        return null;
    }


    // Ausgabe-Methoden
    // Ab hier ist schon alles implementiert :)

    /**
     * Gibt die Elemente eines Integer-Array auf der Kommandozeile aus.
     */
    public void printArray( int[] pArray ) {
        boolean first = true; // Nötig um nicht zu viele Kommata zu setzen

        // Zählschleife für den Durchlauf durchs Arrays
        for( int i = 0; i < pArray.length; i++ ) {
            // Kommata als Trenner
            if( !first ) {
                System.out.print(",");
            } else {
                first = false;
            }

            // Array-Element ausgeben
            System.out.print(pArray[i]);
        }
    }

    /**
     * Gibt die Elemente eines String-Array auf der Kommandozeile aus.
     */
    public void printArray( String[] pArray ) {
        boolean first = true; // Nötig um nicht zu viele Kommata zu setzen

        // Zählschleife für den Durchlauf durchs Arrays
        for( int i = 0; i < pArray.length; i++ ) {
            // Kommata als Trenner
            if( !first ) {
                System.out.print(",");
            } else {
                first = false;
            }

            // Array-Element ausgeben
            System.out.print(pArray[i]);
        }
    }

    /**
     * Gibt die Elemente eines Boolean-Array auf der Kommandozeile aus.
     */
    public void printArray( boolean[] pArray ) {
        boolean first = true; // Nötig um nicht zu viele Kommata zu setzen

        // Zählschleife für den Durchlauf durchs Arrays
        for( int i = 0; i < pArray.length; i++ ) {
            // Kommata als Trenner
            if( !first ) {
                System.out.print(",");
            } else {
                first = false;
            }

            // Array-Element ausgeben
            System.out.print(pArray[i]);
        }
    }

}
