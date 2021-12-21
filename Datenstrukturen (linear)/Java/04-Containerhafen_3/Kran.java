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
            // Hole den obersten Container vom Stapel
            Container c = pSchiff.getStapel1().top();
            // lege auf den ersten Lagerplatz
            pLager.getLager1().push(c);
            // Nimm den obersten Container vom Stapel
            pSchiff.getStapel1().pop();
        }
        // sonst lade vom zweiten Stapel auf einen zufälligen Lagerplatz
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
            c = pLager.getLager1().top();
            pLager.getLager1().pop();
        } else if( !pLager.getLager2().isEmpty() ) {
            // TODO: implementieren
        }
        // TODO: Lagerplatz 3 & 4

        // Container gefunden?
        if( c != null ) {
            // TODO: c auf einen Stapel des Schiffs legen
            // pSchiff.getStapel1().push( ... );
        }
    }

}
