package Strategy2;

import Strategy2.behavior.BowAndArrowBehavior;

public class Troll extends Character {
    public Troll() {
        this.weapon = new BowAndArrowBehavior();
    }
}
