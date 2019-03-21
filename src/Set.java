public class Set {
    private boolean emptiness = true;
    private Object[] container = new Object[10];
    private int count = 0;

    public boolean isEmpty() {
        return emptiness;
    }

    public void add(Object object) {
        container[count] = object;
        count++;
        emptiness = false;
    }

    public boolean contains(Object object) {
        for (int index = 0; index < count; index++) {
            if (container[index].equals(object)) {
                return true;
            }
        }
        return false;
    }
}
