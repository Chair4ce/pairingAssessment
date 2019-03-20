public class Set {
    private int containerSize = 2;
    private Object[] container = new Object[containerSize];
    private int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(Object object) {
        if (this.contains(object)) {
            return;
        }

        if (count == containerSize) {
            containerSize++;
            Object[] newContainer = new Object[containerSize];
            for (int i = 0; i < count; i++) {
                newContainer[i] = container[i];
            }
            container = newContainer;
        }
        this.container[count] = object;
        count++;
    }

    public boolean contains(Object object) {
        for (int index = 0; index < count; index++) {
            if (container[index].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object object) {
        for (int i = 0; i < count; i++) {
            if (container[i].equals(object)) {
                container[i] = null;
                count--;
                return;
            }
        }
//        boolean[] booleans = new boolean[count];
//        for (int i = 0; i < count; i++) {
//            booleans[i] = false;
//            if (container[i].equals(object)) {
//                booleans[i] = true;
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            if (!booleans[i]) {
//
//            }
//        }
    }
}
