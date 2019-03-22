import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SetTest {

    @Test
    public void newEmpty() {
        Set subject = new Set();
        assertTrue(subject.isEmpty());
    }

    @Test
    public void addNotEmpty() {
        Set subject = new Set();
        subject.add(new Object());
        assertFalse(subject.isEmpty());
    }

    @Test
    public void removeEmpty() {
        Set subject = new Set();
        Object chickennuggets = new Object();
        subject.add(chickennuggets);
        subject.remove(chickennuggets);
        assertTrue(subject.isEmpty());
    }

    @Test
    public void addContains() {
        Set subject = new Set();
        Object chnug = new Object();
        subject.add(chnug);
        assertTrue(subject.contains(chnug));
    }

    @Test
    public void addManyContains() {
        Set subject = new Set();
        Object chnug = new Object();
        Object burger = new Object();
        subject.add(chnug);
        subject.add(burger);
        assertTrue(subject.contains(chnug));
        assertTrue(subject.contains(burger));
    }

    //chicken nugget and burger but only care about burger

}