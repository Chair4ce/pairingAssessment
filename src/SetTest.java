Gus Morcate

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
    public void IsNotEmptyAfterAddingChocolate() {
        Set jar = new Set();
        Object chocolate = new Object();
        jar.add(chocolate);
        assertFalse(jar.isEmpty());
    }

    @Test
    public void SetIntegriy() {
        Set tackleBox = new Set();
        Object fishingHook = new Object();
        tackleBox.add(fishingHook);
        assertTrue(tackleBox.contains(fishingHook));
    }

    @Test
    public void SetHasManyObjectsAfterAdd() {
        Set tackleBox = new Set();
        Object fishingHook = new Object();
        Object sinker = new Object();

        tackleBox.add(fishingHook);
        tackleBox.add(sinker);

        assertTrue(tackleBox.contains(fishingHook));
        assertTrue(tackleBox.contains(sinker));
    }
}