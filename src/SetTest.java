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
}