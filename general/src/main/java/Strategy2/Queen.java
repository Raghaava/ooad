package Strategy2;

import Strategy2.behavior.SwordBehavior;

public class Queen extends Character {
    public Queen() {
        this.weapon = new SwordBehavior();
    }
}
