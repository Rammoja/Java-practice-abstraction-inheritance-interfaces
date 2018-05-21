import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasetteDeckTest {
    CassetteDeck cassettedeck;

    @Before
    public void before() {
        cassettedeck = new CassetteDeck("Philips", "X100");
    }

    @Test
    public void canRaiseVolume() {
        assertEquals(15, cassettedeck.raiseVolume(5));
    }

    @Test
    public void canReduceVolume() {
        assertEquals(5, cassettedeck.reduceVolume(5));
    }

    @Test
    public void getPlay() {
        assertEquals("I'm playing Happy", cassettedeck.play("Happy"));
    }
}
