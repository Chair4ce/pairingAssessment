John Schultz

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    @Test
    public void newSetIsEmpty() {
        Set subject = new Set();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void InsertObjectSetNotEmpty() {
        Set subject = new Set();
        Object object = new Object();
        subject.insert(object);
        assertFalse(subject.isEmpty());
    }

    @Test
    public void canRetrieveObjectAfterInsert() {
        Set subject = new Set();
        Object object = new Object();
        subject.insert(object);
        assertTrue(subject.contains(object));
    }

    @Test
    public void canInsertMultipleObjects() {
        Set subject = new Set();
        Object object1 = new Object();
        Object object2 = new Object();
        subject.insert(object1);
        subject.insert(object2);
        assertTrue(subject.contains(object1));
        assertTrue(subject.contains(object2));
    }

    @Test
    public void canRemoveObject() {
        Set subject = new Set();
        Object object1 = new Object();
        subject.remove(object1);
        assertFalse(subject.contains(object1));
    }
}