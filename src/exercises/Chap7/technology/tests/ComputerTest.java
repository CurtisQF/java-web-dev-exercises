package exercises.Chap7.technology.tests;

import exercises.Chap7.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer myComputer;

    @Before
    public void setupComputer() {
        myComputer = new Computer(2600, 3000, "2015");
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(2600, this.myComputer.getScreenWidth());
        assertEquals(3000, this.myComputer.getScreenHeight());
        assertEquals("2015", this.myComputer.getManufactureYear());
    }

    @Test
    public void twoPlusTwoMethod() {
        assertEquals(4, this.myComputer.processTwoPlusTwo());
    }

//    @Test
//    public void tellMeAJokeMethod() {
//        String joke = "Here is a super funny joke.";
//        assertEquals(joke, this.myComputer.tellMeAJoke());
//    }
}
