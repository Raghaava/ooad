package Strategy2;

import Strategy2.behavior.AxeBehavior;

public class King extends Character {
    public King() {
        this.weapon = new AxeBehavior();
    }
}
