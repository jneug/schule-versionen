/**
 * Modelliert ein Containerschiff mit zwei Containerstapeln.
 *
 * Normalerweise haben Containerschiffe erheblich mehr Stapel, aber
 * für unser Beispiel sollen zwei Stapel ausreichen.
 */
public class Containerschiff {

    private Stack<Container> stapel1;

    private Stack<Container> stapel2;

    /**
     * Erzeugt ein neues Containerschiff-Objekt.
     * @param pAnzahl1 Anzahl (zufällig erzeugter) Container auf dem ersten Stapel.
     * @param pAnzahl2 Anzahl (zufällig erzeugter) Container auf dem zweiten Stapel.
     */
    public Containerschiff( int pAnzahl1, int pAnzahl2 ) {
        // Erstellen des ersten Stapel-Objekte mit Inhaltstyp "Container"
        stapel1 = new Stack<Container>();
        // pAnzahl1 Containern auf den ersten Stapel stapeln
        for( int i = 0; i < pAnzahl1; i++ ) {
            stapel1.push(new Container());
        }

        // Erstellen des zweiten Stapel-Objekte mit Inhaltstyp "Container"
        stapel2 = null; // TODO: Zweiten Stapel erzeugen
        // pAnzahl2 Containern auf den zweiten Stapel stapeln
        // TODO: implementieren
    }

    /**
     * Gibt den ersten Stapel zurück.
     * @return Das Stapel-Objekt.
     */
    public Stack<Container> getStapel1() {
        return stapel1;
    }

    /**
     * Gibt den zeiten Stapel zurück.
     * @return Das Stapel-Objekt.
     */
    public Stack<Container> getStapel2() {
        return stapel2;
    }

}
