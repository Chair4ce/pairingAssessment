public class Set {
    private boolean emptiness = true;
    private Object[] container = new Object[10];
    private int count = 0;

    public boolean isEmpty() {
        return this.emptiness;
    }

    public void add(Object object) {
        container[count] = object;
        count++;
        this.emptiness = false;
    }

    public void remove(Object object) {
        if (this.contains(object)) {
            this.container[0] = null;
            this.emptiness = true;
        }
    }

    public boolean contains(Object object) {
        boolean doesContain = false;
        for (int index = 0; index < count; index++) {
            if (container[index] != null && container[index].equals(object)) {
                doesContain = true;
            }
        }
        return doesContain;
    }
}
