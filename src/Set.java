public class Set {
    private boolean empty = true;
    private Object[] container = new Object[10];
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
        boolean doesContain = false;
        for (int index = 0; index < count; index++) {

            if (container[index] == object) {
                doesContain = true;
            }
        }
        return doesContain;
    }
}
