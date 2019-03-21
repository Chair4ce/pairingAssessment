public class Set {
    private Object[] container = new Object[10];
    private int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(Object object) {
        container[count] = object;
        count++;
    }

    public void remove(Object object) {
        int index = indexOf(object);
        if (index > -1) {
            container[index] = container[count - 1];
            container[count - 1] = null;
            count--;
        }
    }

    public boolean contains(Object object) {
        return indexOf(object) > -1;
    }

    private int indexOf(Object object) {
        for (int index = 0; index < count; index++) {
            if (container[index].equals(object)) {
                return index;
            }
        }
        return -1;
    }
}
