public class Set {
    private Object[] container = new Object[10];
    private int objectCount = 0;

    public boolean isEmpty() {
        return objectCount == 0;
    }

    public void add(Object object) {
        container[objectCount] = object;
        objectCount++;
    }

    public void remove(Object object) {
        int index = indexOf(object);
        if (index > -1) {
            container[index] = container[objectCount -1];
            container[objectCount -1] = null;
            objectCount--;
        }
    }

    public boolean contains(Object object) {
        return indexOf(object) > -1;
    }

    private int indexOf(Object object) {
        for (int index = 0; index < objectCount; index++) {
            if (container[index].equals(object)) {
                return index;
            }
        }
        return -1;
    }
}
