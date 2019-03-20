import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    @Test
    public void NewSetIsEmpty() {
        Set subject = new Set();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetIsNotEmptyAfterInput() {
        Set subject = new Set();
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void SetKeepsObjectOnInput() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.contains(object));
    }

    @Test
    public void SetKeepsManyObjectsOnInput() {
        Set subject = new Set();
        Object object1 = new Object();
        Object object2 = new Object();
        subject.add(object1);
        subject.add(object2);

        assertTrue(subject.contains(object1));
        assertTrue(subject.contains(object2));
    }

    @Test
    public void SetKeepsArbitraryNumberOfObjects() {
        Set subject = new Set();
        int max = (int) (Math.random() * 10000);
        for (int i = 0; i < max; i++) {
            subject.add(i);
        }

        Object lastObject = new Object();
        subject.add(lastObject);

        assertTrue(subject.contains(0));
        assertTrue(subject.contains((int) (max - 1) / 2));
        assertTrue(subject.contains(max - 1));
        assertTrue(subject.contains(lastObject));
    }

    @Test
    public void SetShouldNotContainDuplicates() {
        Set subject = new Set();
        Object object = new Object();

        subject.add(object);
        subject.add(object);
        subject.remove(object);

        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetShouldFacilitateMultipleAddsAndRemoves() {
        Set subject = new Set();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        subject.add(object1);
        subject.add(object2);
        subject.remove(object1);
        subject.add(object3);

        assertFalse(subject.contains(object1));
        assertTrue(subject.contains(object2));
        assertTrue(subject.contains(object3));
    }
}