package Strategy2;

import Strategy2.behavior.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        this.weapon = new KnifeBehavior();
    }
}
