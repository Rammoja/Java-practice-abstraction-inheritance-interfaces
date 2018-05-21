import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdplayer;

    @Before
    public void before() {
        cdplayer = new CDPlayer("Sony", "P300");
    }

    @Test
    public void canRaiseVolume() {
        assertEquals(15, cdplayer.raiseVolume(5));
    }

    @Test
    public void canReduceVolume() {
        assertEquals(5, cdplayer.reduceVolume(5));
    }

    @Test
    public void getPlay() {
        assertEquals("I'm playing Happy", cdplayer.play("Happy"));
    }
}
