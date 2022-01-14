import java.util.Random;

public class ListDojo {

    /**
     * Erstellt eine Liste mit aufsteigenden Zahlen (Integern) von <code>1</code>
     * bis <var>pMax</var>.
     * <p>
     * Der Aufruf <code>ascendingList(10)</code> erzeugt die Liste
     * <pre>
     *     1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * </pre>
     *
     * @param pMax Das Maximum der Zahlen
     * @return Die Liste mit aufsteigenden Zahlen
     */
    public List<Integer> ascendingList( int pMax ) {
        /*afg*
        return null;
        *afg*/
    }

    /**
     * Erstellt eine Liste mit <var>pCount</var> Zufallszahlen zwischen <code>pMin</code>
     * und <var>pMax</var>.
     * <p>
     * Der Aufruf <code>randomList(10)</code> erzuegt die Liste
     * <pre>
     *     1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * </pre>
     *
     * @param pMin Das Minimum der Zufallszahlen
     * @param pMax Das Maximum der Zufallszahlen
     * @return Die Liste mit Zufallszahlen
     */
    public List<Integer> randomList( int pCount, int pMin, int pMax ) {
        Random zufall = new Random();

        /*afg*
        return null;
        *afg*/
    }

    /**
     * Gibt eine Liste mit Zahlen auf der Konsole (System.out) aus. Pro Zeile
     * wird ein Element der Liste ausgegeben.
     *
     * @param pList Eine Liste mit Zahlen
     */
    public void printList( List<Integer> pList ) {
    }

    /**
     * Gibt die Namen aller Pokemon in der Liste auf der Konsole (System.out)
     * aus. Pro Zeile ein Name.
     *
     * @param pList Eine Liste mit Pokemon
     */
    public void printPokemon( List<Pokemon> pList ) {
    }

    /**
     * Sucht in der Liste <var>pList</var> nach dem Wert <var>pValue</var> und
     * gibt <code>true</code> zurück, wenn der Wert enthalten ist, <code>false</code>
     * andernfalls.
     *
     * @param pList  Eine Liste mit Zahlen
     * @param pValue Die zu suchende Zahl
     * @return Ob der Wert gefunden wurde
     */
    public boolean searchInList( List<Integer> pList, int pValue ) {
        /*afg*
        return false;
        *afg*/
    }

    /**
     * Such aus der Liste die kleineste Zahl heraus.
     *
     * @param pList Eine Liste mit Zahlen
     * @return Die kleinste Zahl in der Liste
     */
    public int searchMinimum( List<Integer> pList ) {
        // Setze das Minimum zunächst auf den größten möglichen Wert
        int min = Integer.MAX_VALUE;

        // Suche das Minimum aus der Liste
        /*afg*
        return min;
        *afg*/
    }

    /**
     * Fügt den Wert <var>pValue</var> an der Stelle <var>pPosition</var> in
     * die Liste <var>pList</var> ein. Gibt es diese Position nicht, weil die
     * Liste zu kurz ist, wird der Wert hinten angehängt.
     *
     * Die Zählung der Positionen beginnt bei 1. Der Aufruf
     * <code>insertIntoList(liste, 1000, 3)</code> auf der Liste
     * <pre>
     *     1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * </pre>
     *
     * ergibt also
     * <pre>
     *     1, 2, 1000, 3, 4, 5, 6, 7, 8, 9, 10
     * </pre>
     * @param pList     Eine Liste mit Zahlen
     * @param pValue    Die einzufügende Zahl
     * @param pPosition Die Position in der Liste
     */
    public void insertIntoList( List<Integer> pList, int pValue, int pPosition ) {
    }

    /**
     * Löscht den Wert <var>pValue</var> aus der Liste <var>pList</var>. Kommt
     * der Wert mehrfach in der Liste vor, dann wird nur das erste Vorkommen
     * gelöscht.
     * <p>
     * Ist die Zahl nicht in der Liste vorhanden, dann passiert nichts.
     *
     * @param pList  Eine Liste mit Zahlen
     * @param pValue Eine Zahl, die gelöscht werden soll
     */
    public void deleteFromList( List<Integer> pList, int pValue ) {
    }

    /**
     * Löscht die kleinste Zahl aus der Liste. Kommt die kleinste Zahl mehrfach
     * vor, dann wird nur das erste Vorkommen gelöscht.
     *
     * @param pList Eine Liste mit Zahlen
     */
    public void deleteMinimum( List<Integer> pList ) {
        // Tipp: Implementiere zunächst searchMinimum() und deleteFromList()
        // und nutze die Methoden hier.
    }

    /**
     * Gibt eine Liste mit Zahlen vom kleinsten zum größten geordnet aus. Dazu
     * wird in jedem Schritt das Minimum der Liste gesucht, ausgegeben und dann
     * aus der Liste entfernt. Die Liste ist am Ende leer.
     *
     * @param pList Eine Liste mit Zahlen
     */
    public void printOrdered( List<Integer> pList ) {
        while( !pList.isEmpty() ) {
            int min = searchMinimum(pList);
            System.out.println(min);

            deleteMinimum(pList);
        }
    }

    /**
     * Sucht in der Liste <var>pList</var> nach dem Pokemon mit dem Namen
     * <var>pName</var> und gibt das Pokemon-Objekt zurück, wenn der Wert
     * enthalten ist. Andernfalls wird <code>null</code> zurückgegeben.
     *
     * Tipp: Für den Vergleich von zwei Strings sollte equals() benutzt werden.
     *
     * @param pList Eine Liste mit Pokemon
     * @param pName Das zu suchende pokemon
     * @return Das Pokemon-Objekt
     */
    public Pokemon searchInList( List<Pokemon> pList, String pName ) {
        /*afg*
        return null;
        *afg*/
    }

}
