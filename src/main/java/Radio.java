public class Radio extends Component{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune () {
        return "Radio1";
    }

    public int raiseVolume(int volume) {
        return startVolume += volume;
    }

    public int reduceVolume(int volume) {
        return startVolume -= volume;
    }
}
