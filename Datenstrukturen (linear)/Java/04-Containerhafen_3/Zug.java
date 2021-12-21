/**
 * Ein Zug ist eine Reihe von {@link Waggon}s, die hintereinander gezogen
 * werden.
 *
 * !!! Diese Klasse benutzt eine generische Queue mit einem generischen
 * Inhaltstyp. Bearbeite sie erst zum Schluss.
 */
public class Zug {

    // Die Waggons des Zugs mit Inhaltstyp Container.
    private Queue<Waggon<Container>> waggons;

    /**
     * Erstellt einen zug ohen Waggons.
     */
    public Zug() {
        waggons = new Queue<Waggon<Container>>();
    }

    public Queue<Waggon<Container>> getWaggons() {
        return waggons;
    }

    public void setWaggons(Queue<Waggon<Container>> pWaggons) {
        waggons = pWaggons;
    }

    /**
     * Lädt <b>einen</b> Container auf, indem ein neuer Waggon mit dem
     * Container als Ladung "angehängt" wird.
     * @param pContainer
     */
    public void aufladen(Container pContainer) {
        // TODO: implementieren
    }

    /**
     * Hängt den Waggon <var>pWaggon</var> an den Zug an.
     * @param pWaggon
     */
    public void anhängen(Waggon<Container> pWaggon) {
        // TODO: implementieren
    }

}
