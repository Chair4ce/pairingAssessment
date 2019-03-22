public class Set {

    Object[] container = new Object[1000];
    int spot = 0;

    public boolean isEmpty() {
        return spot==0;
    }

    public void add(Object object) {
        container[spot] = object;
        spot++;
    }

    public void remove(Object object) {

        for (int i = 0; i < spot; i++) {
            if (container[i].equals(object)) {
                container[i]= null;
                spot--;
            }
        }

    }

    public boolean contains(Object object) {
        if (container.equals(object)) {
            return true;
        }

        return false;
    }

}


