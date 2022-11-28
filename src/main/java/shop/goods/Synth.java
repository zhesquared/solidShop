package shop.goods;

public class Synth extends Product{
    private final SynthVoices voices;
    private final int keys;

    public Synth(String name, double price, String brand, SynthVoices voices, int keys) {
        super(name, brand, price);
        this.voices = voices;
        this.keys = keys;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", voices= " + voices +
                ", " + keys + " keys.";
    }
}
