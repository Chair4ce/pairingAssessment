import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {
    @Test
    public void NewSetIsEmpty() {
        Set subject = new Set();
        assertTrue(subject.isEmpty())
    }
}