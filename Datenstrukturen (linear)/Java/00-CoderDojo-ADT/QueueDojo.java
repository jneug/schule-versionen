public class QueueDojo {

    public Queue<Boolean> generateBooleans( int pTrue, int pFalse ) {
        return null;
    }

    /**
     * Erstellt eine Queue mit {@code pCount} ganzen Zahlen (Integern). Die Art
     * der Zahlen ist unerheblich, solange es genau {@code pCount} Elemente
     * sind.
     * <p>
     * Bei negativen Angaben für {@code pCount} wird eine leere Queue erzeugt.
     *
     * @param pCount Die Anzahl der Elemente
     * @return Die Schlange mit Elementen
     */
    public Queue<Integer> fillQueue( int pCount ) {
        return null;
    }

    /**
     * Gibt eine Schlange mit Strings auf der Konsole ({@code System.out}) aus.
     * Pro Zeile wird ein Element der Schlange ausgegeben.
     *
     * @param pQueue Eine Schlange mit Zahlen
     */
    public void printQueue( Queue<String> pQueue ) {
    }

    /**
     * Kopiert alle Elemente des angegebenen Arrays in eine neue Schlange und
     * gibt diese zurück.
     *
     * @param pValues Ein Array mit Werten
     * @return Eine Schlange mit den Werten des Arrays
     */
    public Queue<Double> arrayToQueue( double[] pValues ) {
    }

    /**
     * Zählt die Anzahl an Elementen in der angegebenen Schlange. Die Schlange
     * muss nicht erhalten bleiben und kann nach der Ausführung der Methode
     * zerstört sein.
     *
     * @param pQueue Eine Schlange mit Pokemon-Objekten.
     * @return Die Anzahl Elemente in der Schlange.
     */
    public int countElements( Queue<Pokemon> pQueue ) {
        return 0;
    }

    /**
     * Zählt die Anzahl an Elementen in der angegebenen Schlange. Im Gegensatz
     * zu {@link #countElements(Queue)} <b>muss</b> die original Schlange
     * erhalten bleiben. Nach Ausführung der Methode müssen also alle Elemente
     * in derselben Reihenfolge in der Schlange vorhanden sein.
     *
     * @param pQueue Eine Schlange mit Pokemon-Objekten.
     * @return Die Anzahl an Elementen in der Schlange.
     */
    public int countElements2( Queue<Pokemon> pQueue ) {
        return 0;
    }

    /**
     * Filtert aus der angegebenen Schlange mit Würfel-Objekten diejenigen
     * heraus, die eine Augenzahl größer als {@code pValue} zeigen.
     * Herausfiltern meint hier, dass diese Elemente <b>nicht</b> im Ergebnis
     * enthalten sind. Die Schlange mit den verbleibenden Werten wird
     * zurückgegeben.
     *
     * @param pQueue Eine Liste mit {@code Die}-Objekten.
     * @param pValue Ein Grenzwert, ab dem gefiltert wird.
     * @return Eine Liste mit allen Werten, die nicht gefiltert wurden.
     */
    public Queue<Die> filterAbove( Queue<Die> pQueue, int pValue ) {
        return null;
    }

    /**
     * Filtert aus der angegebenen Schlange mit Würfel-Objekten diejenigen
     * heraus, die eine Augenzahl größer als {@code pValue} zeigen.
     * Herausfiltern meint hier, dass diese Elemente <b>nicht</b> im Ergebnis
     * enthalten sind.
     * <p>
     * Die angegebene Schlange {@code pQueue} wird direkt verändert. Das
     * bedeutet, {@code pQueue} enthält nach Ablauf keine Würfel mehr, die eine
     * Augenzahl über {@code pValue} zeigen.
     *
     * @param pQueue Eine Liste mit {@code Die}-Objekten.
     * @param pValue Ein Grenzwert, ab dem gefiltert wird.
     */
    public void filterAboveInPlace( Queue<Die> pQueue, int pValue ) {
    }

}
