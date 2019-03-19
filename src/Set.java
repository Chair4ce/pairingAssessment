public class Set {
    private boolean empty = true;
    private Object[] possessions = new Object[10];
    private int count = 0;

    public boolean isEmpty() {
        return empty;
    }

    public void insert(Object object) {
        possessions[count] = object;
        count++;
        empty = false;
    }

    public void remove(Object object) {
        possessions[0] = null;
        empty = true;
    }

    public boolean possesses(Object object) {
        if (possessions[0] == object) {
            return true;
        }
        return false;
    }
}
