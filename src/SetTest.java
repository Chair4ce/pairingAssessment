import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    @Test
    public void NewSetIsEmpty() {
        assertTrue(new Set().isEmpty());
    }

    @Test
    public void SetIsNotEmptyAfterAdding() {
        Set subject = new Set();
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void SetIsEmptyAfterRemoving() {
        Set subject = new Set();
        subject.add(new Object());
        subject.remove();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void SetContainsObjectAfterAdding() {
        Set subject = new Set();
        Object object = new Object();
        subject.add(object);
        assertTrue(subject.contains(object));
    }
}