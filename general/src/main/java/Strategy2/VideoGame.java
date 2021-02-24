package Strategy2;

import Strategy2.behavior.KnifeBehavior;

public class VideoGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
