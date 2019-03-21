import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    private Set subject;

    @Before
    public void setup() {
        subject = new Set();
    }

    @Test
    public void NewSetIsEmpty() {
        assertTrue(subject.isEmpty());
    }

    @Test
    public void IsNotEmptyAfterAdd() {
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void IsEmptyAfterRemove() {
        Object object = new Object();
        subject.add(object);
        subject.remove(object);
        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetContainsObjectAfterAdd() {
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.contains(object));
    }

    @Test
    public void SetShouldNotContainObjectAfterRemove() {
        Object object = new Object();
        subject.add(object);
        subject.remove(object);
        assertFalse(subject.contains(object));
    }

    @Test
    public void AddManyItems() {
        Object object1 = new Object();
        Object object2 = new Object();
        subject.add(object1);
        subject.add(object2);

        assertTrue(subject.contains(object1));
        assertTrue(subject.contains(object2));
    }

    @Test
    public void RemoveManyItems() {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        subject.add(object1);
        subject.add(object2);
        subject.add(object3);
        subject.remove(object1);
        subject.remove(object2);

        assertFalse(subject.contains(object1));
        assertFalse(subject.contains(object2));
        assertTrue(subject.contains(object3));
    }
}