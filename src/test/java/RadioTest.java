import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

        Radio radio;

        @Before
        public void before() {
            radio = new Radio("LG", "T200");
        }

        @Test
        public void canRaiseVolume() {
            assertEquals(15, radio.raiseVolume(5));
        }

        @Test
        public void canReduceVolume() {
            assertEquals(7, radio.reduceVolume(3));
        }

        @Test
        public void getTune() {
            assertEquals("Radio1", radio.tune());
        }


}