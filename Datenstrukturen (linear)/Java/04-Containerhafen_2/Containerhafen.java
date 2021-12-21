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
        // Lade Container ab, bis beide Stapel leer sind.
        while( !pSchiff.getStapel1().isEmpty() && !pSchiff.getStapel2().isEmpty() ) {
            // TODO: implementieren
        }
    }

    /**
     * Belädt das Schiff mit <var>pMax</var> Containern von den Stapeln.
     * @param pSchiff
     */
    public void schiffBeladen(Containerschiff pSchiff, int pMax ) {
        // Lade Container ab, bis entweder alle Stapel im Lager leer sind,
        // oder pMax Container verladen wurden.
        while(
            !lager.getLager1().isEmpty() && !lager.getLager2().isEmpty() &&
                // TODO: Lager 3 & 4
                pMax > 0 ) {

            pMax -= 1;
        }
    }

    /**
     * Lädt <var>pMax</var> Container aus der Abfertigung auf den Zug.
     * @param pZug
     */
    public void zugBeladen( Zug pZug, int pMax ) {
        while( !lager.getAbfertigung().isEmpty() && pMax > 0 ) {
            // TODO: Container aus Abfertigung auf Zug laden.
        }
    }

}
