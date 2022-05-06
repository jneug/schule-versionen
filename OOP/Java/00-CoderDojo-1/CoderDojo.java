/**
 * Das CoderDojo Projekt ist eine Sammlung unzusammenhängender Übungen zur
 * Objektorientierten Programmierung.
 * <p>
 * Dieser Dojo befasst sich mit den grundlegenden Konzepten der imperativen
 * Programmierung mit Java: Variablen, Kontrollstrukturen, usw.
 * <p>
 * Im Kommentar jeder Methode steht eine Beschreibung des Problems, dass in der
 * Methode gelöst werden soll. Die Klasse {@link CoderDojoTest} enthält
 * Testmethoden, die prüfen, ob die Methode korrekt implementiert wurde. Die
 * Tests können in BlueJ mit einem Rechtsklick auf die Testklasse gestartet
 * werden.
 * <p>
 * Du kannst die Methoden in beliebiger Reihenfolge implementieren. Such dir
 * also die für dich interessantesten heraus.
 * <p>
 * TODO:
 * Implementiere die Methoden nach der Beschreibung im jeweiligen
 * Kommentar. Teste deine Umsetzungen regelmäßig mit den Test-Methoden
 * in der Klasse {@link CoderDojoTest}.
 */
public class CoderDojo {

    /**
     * Ermittelt das Maximum der Zahlen <var>a</var> und
     * <var>b</var>.
     *
     * @param a Erste Zahl.
     * @param b Zweite Zahl.
     * @return Die größere der Zahlen.
     */
    public int max( int a, int b ) {
        return 0;
    }

    /**
     * Ermittelt das Maximum der drei Zahlen <var>a</var>, <var>b</var> und
     * <var>c</var>.
     *
     * @param a Erste Zahl.
     * @param b Zweite Zahl.
     * @param c Dritte Zahl.
     * @return Die größte der drei Zahlen.
     */
    public int max( int a, int b, int c ) {
        return 0;
    }

    /**
     * Prüft, ob wir heute ausschlafen können. Dies ist abhängig davon, ob es
     * kein Wochentag ist (also Wochenende) <em>oder</em> wir im Urlaub sind.
     *
     * @param isWeekday {@code true}, wenn es ein Wochentag ist.
     * @param isVacation {@code true}, wenn wir im Urlaub sind.
     * @return {@code true}, wenn wir ausschlafen können.
     */
    public boolean sleepIn( boolean isWeekday, boolean isVacation ) {
        return false;
    }

    /**
     * Prüft, ob eine der Zahlen, oder ob die Summe der Zahlen gleich zehn ist.
     *
     * @param a Die erste Zahl.
     * @param b Die zweite Zahl.
     * @return {@code true}, wenn eine der Zahlen oder die Summe gleich zehn
     * ist.
     */
    public boolean makes10( int a, int b ) {
        return false;
    }

    /**
     * Prüft, ob die Zahl gerade ist.
     * <p>
     * <b>Hinweis:</b> Mit dem Modulo-Operator ({@code %}) kannst du
     * <em>den Rest</em> einer ganzzahligen Division bestimmen:
     * <pre>
     * 25 % 3 = 1
     * 26 % 3 = 2
     * 27 % 3 = 0
     * </pre>
     * <p>
     * Diese Operation ist sehr hilfreich, um die Methode zu implementieren.
     *
     * @param pNumber Eine Zahl.
     * @return {@code true}, wenn die Zahl gerade ist.
     */
    public boolean isEven( int pNumber ) {
        return false;
    }

    /**
     * Prüft, ob die Zahl durch drei <b>oder</b> durch fünf teilbar ist.
     *
     * @param pNumber
     * @return
     */
    public boolean threeOrFive( int pNumber ) {
        return false;
    }

    /**
     * Prüft, ob die Zahl durch drei <b>und</b> durch fünf teilbar ist.
     *
     * @param pNumber
     * @return
     */
    public boolean threeAndFive( int pNumber ) {
        return false;
    }

    /**
     * Simuliert das Spiel "PiffPaff".
     * <p>
     * Bei <em>PiffPaff</em> werden alle Zahlen von {@code 1} (hier bis zum
     * Maximum <var>pMax</var>) der Reihe nach aufgezählt. Ist die Zahl durch
     * {@code 3} teilbar, wird statt der Zahl das Wort "piff" ausgegeben. Ist
     * die Zahl durch {@code 5} teilbar, dann wird "paff" ausgegeben. ist die
     * Zahl durch {@code 3} <b>und</b> {@code 5} teilbar, dann wird "piffpaff"
     * ausgegeben.
     * <p>
     * Die Ausgabe soll auf der Konsole ({@link System#out} erscheinen und am
     * Ende soll die Methode die Anzahl der "piffpaff" zurückgeben.
     * <p>
     * Beim Aufruf {@code piffPaff(15)} wird also ausgegeben:
     * <pre>
     * 1
     * 2
     * piff
     * 4
     * paff
     * piff
     * 7
     * 8
     * piff
     * paff
     * 11
     * piff
     * 13
     * 14
     * piffpaff
     * </pre>
     * Die Rückgabe ist dann {@code 1}.
     *
     * @param pMax Zahl, bis zu der gespielt wird.
     * @return Anzahl der "piffpaff".
     */
    public int piffPaff( int pMax ) {
        return 0;
    }

    /**
     * Erstellt einen HTML-Tag mit dem Namen <var>pTag</var> und dem Inhalt
     * <var>pText</var>. Ein HTMl-Tag hat das Format
     *
     * <pTag>pText</pTag>
     *
     * @param pText Ein Text, der im Tag stehen soll.
     * @param pTag Der Name des HTML-Tags.
     * @return Der fertige Tag.
     */
    public String makeTag( String pText, String pTag ) {
        return "";
    }

    /**
     * Zählt, wie oft das Zeichen <var>pChar</var> im String <var>pText</var>
     * vorkommt und gibt die Anzahl zurück.
     *
     * @param pText Ein Text.
     * @param pChar Das Zeichen, das gezählt werden soll.
     * @return Die Anzahl der Vorkommen des Zeichens im Text.
     */
    public int countChars( String pText, char pChar ) {
        return 0;
    }

    /**
     * Verdoppelt den String <var>pText</var>.
     * <p>
     * Aus {@code "Hallo"} wird also {@code "HalloHallo"}.
     *
     * @param pText Der zu verdoppelnde Text.
     * @return Der verdoppelte Text.
     */
    public String duplicateString( String pText ) {
        return "";
    }

    /**
     * Gibt einen neuen String zurück, der aus <var>pTimes</var> Wiederholungen
     * des Strings <var>pText</var> besteht. Zum Beispiel
     * <pre>
     * repeatString("foo", 4) // foofoofoofoo
     * </pre>
     *
     * @param pText Der zu wiederholende Text.
     * @return Der wiederholte Text.
     */
    public String repeatString( String pText, int pTimes ) {
        return "";
    }


    /**
     * Ermittelt den Namen eines Pokemons.
     *
     * @param pPokemon Ein Pokemon.
     * @return Der Name des Pokemons.
     * @see Pokemon#getName()
     */
    public String getPokemonName( Pokemon pPokemon ) {
        return "";
    }

    /**
     * Lässt zwei {@link Pokemon} gegeneinander kämpfen und gibt den Sieger
     * zurück.
     * <p>
     * Dabei wird der {@link Pokemon#getAttack() Angriffswert} des
     * <var>pAttacker</var> mit dem {@link Pokemon#getDefense()
     * Verteidigungswert} des
     * <var>pDefender</var> verglichen. Ist der Wert größer, dann gewinnt der
     * Angreifer, sonst der Verteidiger.
     *
     * @param pAttacker Der Angreifer.
     * @param pDefender Der Verteidiger.
     * @return Der Sieger des Kampfes.
     */
    public Pokemon pokemonFight( Pokemon pAttacker, Pokemon pDefender ) {
        return null;
    }

    /**
     * Erhöht den Attack-Wert des Pokemons um den angegebenen Wert.
     * <p>
     * Implementiere dazu zunächst die Methode {@link Pokemon#addAttack(int)} in
     * der Klasse {@link Pokemon}.
     *
     * @param pPokemon Ein Pokemon.
     * @param pValue Um wieviel der Wert erhöht werden soll.
     * @see Pokemon#addAttack(int)
     */
    public void addAttack( Pokemon pPokemon, int pValue ) {
    }

}
