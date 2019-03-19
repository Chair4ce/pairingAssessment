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

    public boolean contains(Object object) {
        for (int index = 0; index < count; index++) {
            if (container[index] == object) {
                return true;
            }
        }
        return false;
    }
}
