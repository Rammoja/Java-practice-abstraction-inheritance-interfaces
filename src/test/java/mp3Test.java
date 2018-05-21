import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mp3Test {

    mp3 mp3;
    Stereo stereo;
    CDPlayer cdplayer;
    Radio radio;
    CassetteDeck cassettedeck;

    @Before
    public void before() {
        mp3 = new mp3("Apple", "iphone");
        cdplayer = new CDPlayer("AAA", "BBB");
        radio = new Radio("CCC", "DDD");
        cassettedeck = new CassetteDeck("EEE", "FFF");
        stereo = new Stereo("Bubbles", cdplayer, radio, cassettedeck);

    }

    @Test
    public void getConnect () {
        assertEquals("Bubbles", mp3.connect(stereo));
    }
}
