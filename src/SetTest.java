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
        Object hammer = new Object();
        subject.add(hammer);
        assertFalse(subject.isEmpty());
    }

    @Test
    public void ShouldContainObjectAfterAdd() {
        Set subject = new Set();
        Object hammer = new Object();
        subject.add(hammer);
        assertTrue(subject.contains(hammer));
    }

    @Test
    public void ShouldContainManyObjectsAfterAdd(){
        Set subject = new Set();
        Object hammer = new Object();
        Object wrench = new Object();
        subject.add(hammer);
        subject.add(wrench);

        assertTrue(subject.contains(hammer));
        assertTrue(subject.contains(wrench));
    }


}