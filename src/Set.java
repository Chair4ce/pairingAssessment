public class Set {
    private Object[] container = new Object[10];
    private boolean empty = true;
    private int count = 0;

    public boolean isEmpty() {
        return empty;
    }

    public void add(Object object) {
        container[count] = object;
        count = count + 1;
        empty = false;
    }

    public boolean contains(Object object) {
        boolean iHaveIt = false;
        for (int index = 0; index < 10; index++) {
            if (container[index] == object) {
                iHaveIt = true;
            }
        }
        return iHaveIt;
    }
}
