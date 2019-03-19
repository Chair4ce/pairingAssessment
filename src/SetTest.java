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
    public void SetIsNotEmptyAfterAdd() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        assertFalse(subject.isEmpty());
    }

    @Test
    public void SetContainsObjectAfterAdd() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.contains(object));
    }

    @Test
    public void SetShouldNotContainUnaddedObject() {
        Set subject = new Set();
        Object hammer = new Object();
        Object nail = new Object();
        subject.add(hammer);
        assertFalse(subject.contains(nail));
    }

    @Test
    public void SetCanAddManyObjects() {
        Set subject = new Set();
        Object hammer = new Object();
        Object nail = new Object();

        subject.add(hammer);
        subject.add(nail);

        assertFalse(subject.isEmpty());
        assertTrue(subject.contains(hammer));
        assertTrue(subject.contains(nail));
    }
}