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
    public void SetIsNotEmptyAfterAddObject() {
        Set subject = new Set();
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void SetContainsAddedObject() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.checkObject(object));
    }

    @Test
    public void SetContainsMultipleObjects() {
        Set subject = new Set();
        Object object1 = new Object();
        Object object2 = new Object();
        subject.add(object1);
        subject.add(object2);
        assertTrue(subject.checkObject(object1));
        assertTrue(subject.checkObject(object2));
    }

    @Test
    public void SetDoesNotContainDuplicates() {
        Set subject = new Set();
        Object object1 = new Object();
        subject.add(object1);
        subject.add(object1);
        subject.add(object1);
        subject.add(object1);
        subject.add(object1);
        subject.add(object1);
        subject.delete(object1);
        assertTrue(subject.isEmpty());
    }

    @Test
    public void RemoveObject() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        subject.delete(object);
        assertFalse(subject.checkObject(object));
    }
}