
public class StackDojo {

    /**
     * Gibt einen Stapel mit Zahlen auf der Konsole ({@code System.out}) aus.
     * Pro Zeile wird ein Element des Stapels ausgegeben.
     * <p>
     * Wird für {@code pStack} der Wert {@code null} übergeben, dann wird der
     * Test {@code Kein gültiger Stack} ausgegeben.
     *
     * @param pStack Ein Stapel mit Zahlen
     */
    public void printStack( Stack<Integer> pStack ) {
    }

    /**
     * Wirft jeden {@link Die Würfeln} im angegebenen Stapel durch Aufruf der
     * {@link Die#roll()}-Methode und gibt dann die
     * {@link Die#getValue() geworfene Augenzahl} auf der Konsole
     * ({@code System.out}) aus. Pro Zeile wird ein Würfelergebnis ausgegeben.
     * <p>
     * Es kann davon ausgegangen werden, dass {@code pStack} niemals
     * {@code null} ist. Der Stack {@lcode pStack} muss nicht erhalten bleiben
     * und kann nach der Ausführung der Methode zerstört sein.
     *
     * @param pStack Ein Stapel mit {@code Die}-Objekten.
     */
    public void rollAndPrint( Stack<Die> pStack ) {
    }

    /**
     * Erzeugt einen neuen Stapel, in dem sich alle {@link Pokemon} befinden,
     * die einen höheren {@link Pokemon#getAttack() Angriffswert} als
     * {@link Pokemon#getDefense() Verteidigungswert} besitzen.
     * <p>
     * Falls {@code pStack} gleich {@code null} ist, wird ein leerer Stapel
     * erzeugt.
     * <p>
     * Der Stack {@lcode pStack} muss nicht erhalten bleiben und kann nach der
     * Ausführung der Methode zerstört sein.
     *
     * @param pStack Ein Stapel mit {@code Pokemon}-Objekten.
     * @return Ein neuer Stapel mit den "starken" Pokemon.
     */
    public Stack<Pokemon> getStrongPokemon( Stack<Pokemon> pStack ) {
    }


    /**
     * Lässt die {@link Pokemon} zweier Trainer gegeneinander antreten. Beide
     * Trainer legen eine Reihenfolge fest, in der ihre Pokemon kämpfen sollen
     * und übergeben diese als {@link Stack}. Beim Kampf treten nun immer die
     * beiden obersten Pokemon gegeneinander an.
     * <p>
     * Ein Pokemon gewinnt einen Kampf, wenn sein
     * {@link Pokemon#getAttack() Angriff} höher ist als die
     * {@link Pokemon#getDefense() Verteidigung} des Gegnerpokemons. Der
     * Verlierer wird aus dem Kampf entfernt, die Gewinnerin bleibt für die
     * nächste Runde im Kampf.
     * <p>
     * Falls ein Kampf im Gleichstand endet (beide haben eine höhere Attacke als
     * die Verteidigung des Gegners oder keiner kann gegen den anderen gewinnen)
     * verlieren beide Pokemon und werden aus dem Kampf entfernt.
     * <p>
     * Wer am Ende noch mindestens ein Pokemon in seiner Kampfaufstellung hat,
     * gewinnt den Kampf. Der Stack mit den verbleibenden Pokemon wird
     * zurückgegeben. Hat keiner mehr ein Pokemon übrig, wird ein leerer Stapel
     * zurückgegeben.
     * <p>
     * Wie viele Pokemon die Trainer jeweils in den Kampf schicken ist nicht
     * festgelegt. Sollte ein Kämpfer nichr antreten wird {@code null}
     * übergeben. In diesem Fall gewinnt der verbleibende Spieler automatisch.
     * Sind beide Stapel {@code null}, wird ein leerer Stack erzeugt.
     *
     * @param pTrainer1 Die Angriffsreihenfolge des ersten Trainers.
     * @param pTrainer2 Die Angriffsreihenfolge der zweiten Trainerin.
     * @return Die verbleibenden Pokemon des Siegers / der Siegerin.
     */
    public Stack<Pokemon> pokemonFight( Stack<Pokemon> pTrainer1, Stack<Pokemon> pTrainer2 ) {
        return null;
    }

}
