

public abstract class Component {

    private String make;
    private String model;
    protected int startVolume;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
        this.startVolume = 10;
    }

    public int getVolume() {
        return this.startVolume;
    }

    public abstract int raiseVolume(int volume);

    public abstract int reduceVolume(int volume);
}
