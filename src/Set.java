public class Set {
    private boolean empty = true;
    private Object[] bucket = new Object[10];
    private int position = 0;

    public boolean isEmpty() {
        return this.empty;
    }

    public void insert(Object object) {
        this.bucket[this.position] = object;
        this.position++;
        this.empty = false;
    }

    public boolean contains(Object object) {
        return this.indexOf(object) > -1;
    }

    public void remove(Object object) {
        if (this.contains(object)) {
            this.bucket[this.indexOf(object)] = null;
        }
    }

    private int indexOf(Object object) {
        for (int index = 0; index < this.position; index++) {
            if (this.bucket[index] == object) {
                return index;
            }
        }
        return -1;
    }
}
