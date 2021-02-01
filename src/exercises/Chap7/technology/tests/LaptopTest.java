package exercises.Chap7.technology.tests;

import exercises.Chap7.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    Laptop myLaptop;

    @Before
    public void setupLaptop() {
        myLaptop = new Laptop(1500, 1000, "2016", false);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(1500, this.myLaptop.getScreenWidth());
        assertEquals(1000, this.myLaptop.getScreenHeight());
        assertEquals("2016", this.myLaptop.getManufactureYear());
        assertEquals(false, this.myLaptop.isIntelliJOpen());
    }

    @Test
    public void twoPlusTwoMethod() {
        assertEquals(4, this.myLaptop.processTwoPlusTwo());
    }

    @Test
    public void openIntelliJSetsTrue() {
        assertEquals(false, this.myLaptop.isIntelliJOpen());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.isIntelliJOpen());
    }
}
