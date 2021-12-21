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
        // TODO: implementieren
    }

    /**
     * Lädt einen Container aus dem Lager in das Schiff, falls im Lager noch
     * Container vorhanden sind.
     * @param pSchiff
     * @param pLager
     */
    public void aufladenAuf(Containerschiff pSchiff, Containerlager pLager) {
        // TODO: implementieren
    }

}
