public class mp3 extends Component implements IConnect {

    public mp3(String make, String model) {
    super(make, model);
    }

    public int raiseVolume(int volume) {
        return startVolume += volume;
    }

    public int reduceVolume(int volume) {
        return startVolume -= volume;
    }

    public String connect(Stereo stereo) {
        return stereo.getName();
    }

}
