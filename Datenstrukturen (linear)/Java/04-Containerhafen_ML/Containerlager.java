public class Containerlager {

    private Stack<Container> lager1;
    private Stack<Container> lager2;
    private Stack<Container> lager3;
    private Stack<Container> lager4;

    // Die Abfertigungsschlange ist ein Zwischenlager,
    // in dem Container geparkt werden, die demnächst von einem Zug
    // oder LKW abgeholt werden sollen.
    private Queue<Container> abfertigung;

    public Containerlager() {
        lager1 = new Stack<Container>();
        lager2 = new Stack<Container>();
        lager3 = new Stack<Container>();
        lager4 = new Stack<Container>();
        // TODO: Abfertigunsschlange initialisieren
        abfertigung = new Queue<Container>();
    }

    /**
     * Prüft, ob das Containerlager leer ist, also aller Lagerstapel leer sind.
     * @return
     */
    public boolean istLeer() {
        return (lager1.isEmpty() && lager2.isEmpty() && lager3.isEmpty() && lager4.isEmpty());
    }

    /**
     * Nimmt einen Container von einem der Stapel und bringt ihn
     * zur Abfertigung.
     */
    public void naechsterZurAbfertigung() {
        if( !lager1.isEmpty() ) {
            abfertigung.enqueue(lager1.top());
            lager1.pop();
        } else if( !lager2.isEmpty() ) {
            abfertigung.enqueue(lager2.top());
            lager2.pop();
        } else if( !lager3.isEmpty() ) {
            abfertigung.enqueue(lager3.top());
            lager3.pop();
        } else if( !lager4.isEmpty() ) {
            abfertigung.enqueue(lager4.top());
            lager4.pop();
        }
    }

    public Stack<Container> getLager1() {
        return lager1;
    }

    public void setLager1(Stack<Container> pLager1) {
        lager1 = pLager1;
    }

    public Stack<Container> getLager2() {
        return lager2;
    }

    public void setLager2(Stack<Container> pLager2) {
        lager2 = pLager2;
    }

    public Stack<Container> getLager3() {
        return lager3;
    }

    public void setLager3(Stack<Container> pLager3) {
        lager3 = pLager3;
    }

    public Stack<Container> getLager4() {
        return lager4;
    }

    public void setLager4(Stack<Container> pLager4) {
        lager4 = pLager4;
    }

    public Queue<Container> getAbfertigung() {
        return abfertigung;
    }

    public void setAbfertigung(Queue<Container> pAbfertigung) {
        abfertigung = pAbfertigung;
    }

}
