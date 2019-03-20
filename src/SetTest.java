import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    private Set subject;
    private Object object;

    @Before
    public void setup() {
        subject = new Set();
        object = new Object();
    }

    @Test
    public void NewSetIsEmpty() {
        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetIsNotEmptyAfterAdd() {
        subject.add(object);
        assertFalse(subject.isEmpty());
    }

    @Test
    public void EmptyTheBucket() {
        subject.add(object);
        subject.remove(object);
        assertTrue(subject.isEmpty());
    }

    @Test
    public void RemoveAnObject() {
        subject.add(object);
        subject.remove(object);
        assertFalse(subject.contains(object));
    }

    @Test
    public void CanAddObjects() {
        Object object1 = new Object();
        Object object2 = new Object();

        subject.add(object1);
        subject.add(object2);

        assertFalse(subject.isEmpty());
        assertTrue(subject.contains(object1));
        assertTrue(subject.contains(object2));
    }
    //remove should decrement

    @Test
    public void CanRemoveObject() {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        subject.add(object1);
        subject.add(object2);
        subject.add(object3);
        subject.add(object4);
        subject.remove(object2);
        subject.remove(object4);
        subject.remove(object3);
        subject.remove(object1);

        subject.remove(new Object());

        assertTrue(subject.isEmpty());
        assertFalse(subject.contains(object1));
        assertFalse(subject.contains(object2));
    }
}
