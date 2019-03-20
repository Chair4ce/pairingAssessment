public class Set {
    private boolean emptiness = true;
    private Object[] container = new Object[10];

    public boolean isEmpty() {
        return this.emptiness;
    }

    public void add(Object object) {
        container[0] = object;
        this.emptiness = false;
    }

    public void remove() {
        this.emptiness = true;
    }

    public boolean contains(Object object) {
        boolean doesContain = false;
        if (container[0].equals(object)) {
            doesContain = true;
        }
        return doesContain;
    }
}
