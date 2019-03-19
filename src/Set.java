public class Set {
    private Object[] items = new Object[10];
    private int itemCount = 0;

    public boolean isEmpty() {
        return itemCount == 0;
    }

    public void add(Object object) {
        if (!checkObject(object)) {
            items[itemCount] = object;
            itemCount++;
        }
    }

    public void delete(Object object) {
        if (checkObject(object)) {
            items[indexOf(object)] = null;
            itemCount--;
        }
    }

    public boolean checkObject(Object object) {
        boolean contains = false;
        for (int index = 0; index < itemCount; index++) {
            if (items[index] == object) {
                contains = true;
            }
        }
        return contains;
    }

    private int indexOf(Object object) {
        for (int index = 0; index < itemCount; index++) {
            if (items[index] == object) {
                return index;
            }
        }
        return -1;
    }
}
