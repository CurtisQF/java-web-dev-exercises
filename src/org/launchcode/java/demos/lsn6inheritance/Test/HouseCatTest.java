package org.launchcode.java.demos.lsn6inheritance.Test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import static org.junit.Assert.assertEquals;

public class HouseCatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
