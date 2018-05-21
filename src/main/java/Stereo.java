public class Stereo {
    private String name;
    private CDPlayer cdplayer;
    private Radio radio;
    private CassetteDeck cassettedeck;

    public Stereo(String name, CDPlayer cdplayer, Radio radio, CassetteDeck cassettedeck){
        this.name = name;
        this.cdplayer = cdplayer;
        this.radio = radio;
        this.cassettedeck = cassettedeck;

    }

    public String getName() {
        return this.name;
    }
}
