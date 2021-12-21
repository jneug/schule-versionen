import java.util.Random;

/**
 * Ein Hafenkran, der Container von einem Schiff in das Lager bzw.
 * zurück laden kann.
 */
public class Kran {

    /**
     * Erzeugt ein neues Kran-Objekt.
     */
    public Kran() {

    }

    /**
     * Lädt <b>genau einen</b> Container vom Schiff in das Lager, falls das Schiff noch
     * nicht leer ist.
     * @param pSchiff
     * @param pLager
     */
    public void abladenVon(Containerschiff pSchiff, Containerlager pLager) {
        // Lade vom ersten Stapel auf Lager 1
        // (Du kannst zB auch mit Random einen zufälligen Platz auswählen.)
        if( !pSchiff.getStapel1().isEmpty() ) {
            // TODO: implementieren
        }
        // sonst lade vom zweiten Stapel auf Lager 2
        else if( !pSchiff.getStapel2().isEmpty() ) {
            // TODO: implementieren
        }
    }

    /**
     * Lädt einen Container aus dem Lager in das Schiff, falls im Lager noch
     * Container vorhanden sind.
     * @param pSchiff
     * @param pLager
     */
    public void aufladenAuf(Containerschiff pSchiff, Containerlager pLager) {
        // Suche einen Container von einem nicht leeren Lagerplatz
        Container c = null; // Noch kein Container gefunden
        if( !pLager.getLager1().isEmpty() ) {
            // TODO: obersten Container in c speichern und aus lager1 entfernen
        } else if( !pLager.getLager2().isEmpty() ) {
            // TODO: implementieren
        }
        // TODO: Lagerplatz 3 & 4

        // Container gefunden?
        if( c != null ) {
            // TODO: c auf einen Stapel des Schiffs legen
        }
    }

}
