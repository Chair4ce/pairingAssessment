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
        subject.add();
        assertFalse(subject.isEmpty());
    }
}