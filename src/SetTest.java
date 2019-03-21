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
    public void AddObject() {
        Set parkingGarage = new Set();
        Object car = new Object();
        parkingGarage.add(car);
        assertFalse(parkingGarage.isEmpty());
        assertTrue(parkingGarage.contains(car));
    }

    @Test
    public void AddManyObjects() {
        Set parkingGarage = new Set();
        Object car = new Object();
        Object truck = new Object();
        Object van = new Object();
        parkingGarage.add(car);
        parkingGarage.add(truck);
        parkingGarage.add(van);

        assertFalse(parkingGarage.isEmpty());
        assertTrue(parkingGarage.contains(car));
        assertTrue(parkingGarage.contains(truck));
        assertTrue(parkingGarage.contains(van));
    }
}