package exercises.Chap7.technology.tests;

import exercises.Chap7.technology.main.Laptop;
import exercises.Chap7.technology.main.Smartphone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmartphoneTest {

    Smartphone mySmartphone;

    @Before
    public void setupSmartphone() {
        mySmartphone = new Smartphone(1500, 1000, "2016", false);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(1500, this.mySmartphone.getScreenWidth());
        assertEquals(1000, this.mySmartphone.getScreenHeight());
        assertEquals("2016", this.mySmartphone.getManufactureYear());
        assertEquals(false, this.mySmartphone.isConnectedTo5G());
    }

    @Test
    public void twoPlusTwoMethod() {
        assertEquals(4, this.mySmartphone.processTwoPlusTwo());
    }
}
