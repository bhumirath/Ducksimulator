package adapters;

import animals.Goose;
import animals.Quackable;

public class GooseAdap implements Quackable {
    private Goose goose;

    public GooseAdap(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
