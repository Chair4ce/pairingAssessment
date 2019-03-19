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
    public void setHasObjectAfterInsert() {
        Set subject = new Set();
        Object object = new Object();
        subject.insert(object);
        assertTrue(subject.possesses(object));
    }

    @Test
    public void setDoesNotHaveObjectAfterRemove() {
        Set subject = new Set();
        Object object = new Object();
        subject.insert(object);
        subject.remove(object);
        assertTrue(subject.isEmpty());
        assertFalse(subject.possesses(object));
    }

    @Test
    public void setHasMultipleObjectsAfterInsert() {
        Set subject = new Set();
        Object object1 = new Object();
        Object object2 = new Object();
        subject.insert(object1);
        subject.insert(object2);
        assertTrue(subject.possesses(object1));
        assertTrue(subject.possesses(object2));
    }
}