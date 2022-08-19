package adapters;


import animals.Pigeon;
import animals.Quackable;

public class PigeonAdap implements Quackable {
    private Pigeon pigeon;

    public PigeonAdap(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
