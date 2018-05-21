public class CDPlayer extends Component implements IPlay{


    public CDPlayer(String make, String model) {
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
