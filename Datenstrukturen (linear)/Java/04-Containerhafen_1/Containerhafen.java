public class Containerhafen {

    private Containerlager lager;
    private Kran kran;

    public Containerhafen( Containerlager pLager, Kran pKran ) {
        lager = pLager;
        kran = pKran;
    }

    public Containerlager getLager() {
        return lager;
    }

    public void setLager(Containerlager pLager) {
        lager = pLager;
    }

    public Kran getKran() {
        return kran;
    }

    public void setKran(Kran pKran) {
        kran = pKran;
    }

    /**
     * Lädt die Container vom Schiff auf die Stapel.
     * @param pSchiff
     */
    public void schiffAbladen(Containerschiff pSchiff) {
        // TODO: implementieren
    }

    /**
     * Belädt das Schiff mit <var>pMax</var> Containern von den Stapeln.
     * @param pSchiff
     */
    public void schiffBeladen(Containerschiff pSchiff, int pMax ) {
        // TODO: implementieren
    }

    /**
     * Lädt <var>pMax</var> Container aus der Abfertigung auf den Zug.
     * @param pZug
     */
    public void zugBeladen( Zug pZug, int pMax ) {
        // TODO: implementieren
    }

}
