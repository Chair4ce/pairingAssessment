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
        assertTrue(new Set().isEmpty());
    }

    @Test
    public void SetIsNotEmptyAfterAdding() {
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void SetIsEmptyAfterRemoving() {
        Object object = new Object();
        subject.add(object);
        subject.remove(object);
        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetContainsObjectAfterAdding() {
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.contains(object));
    }

    @Test
    public void SetDoesNotContainObjectAfterRemoving() {
        Object object = new Object();
        subject.add(object);
        subject.remove(object);
        assertFalse(subject.contains(object));
    }

    @Test
    public void SetContainsMultipleObjectsAfterAdd() {
        Object object1 = new Object();
        Object object2 = new Object();
        subject.add(object1);
        subject.add(object2);

        assertTrue(subject.contains(object1));
        assertTrue(subject.contains(object2));
    }

    @Test
    public void SetRemovesMany() {
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

    @Test
    public void NoDuplicates() {
        Object object = new Object();
        subject.add(object);
        subject.add(object);
        subject.add(object);
        subject.add(object);
        subject.remove(object);
        assertTrue(subject.isEmpty());
        assertFalse(subject.contains(object));
    }

    @Test
    public void AnySizeSet() {
        int objectCount = (int) (Math.random() * 10000);
        for (int i = 0; i < objectCount; i++) {
            subject.add(i);
        }

        assertTrue(subject.contains(0));
        assertTrue(subject.contains(objectCount / 2));
        assertTrue(subject.contains(objectCount - 1));
    }
}