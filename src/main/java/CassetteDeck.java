public class CassetteDeck extends Component implements IPlay{

    public CassetteDeck(String make, String model) {
        super(make, model);
    }

    public int raiseVolume(int volume) {
        return startVolume += volume;
    }

    public int reduceVolume(int volume) {
        return startVolume -= volume;
    }

    public String play(String song) {
        return "I'm playing " + song;
    }
}
