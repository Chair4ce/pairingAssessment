public class Set {
    private boolean emptiness = true;

    public boolean isEmpty() {
        return this.emptiness;
    }

    public void add() {
        this.emptiness = false;
    }

    public void remove() {
        this.emptiness = true;
    }
}
