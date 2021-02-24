package Strategy;

import Strategy.flybehaviours.RocketSpeedFly;

public class SimUDuck {
    public static void main(String... args) {
        Duck mDuck = new MallardDuck();
        Duck reDuck = new RedheadDuck();
        Duck ruDuck = new RubberDuck();

        ruDuck.swim();
        ruDuck.performQuack();
        ruDuck.display();
        ruDuck.performFly();

        System.out.println("----------------------");

        ruDuck.setFlyBehaviour(new RocketSpeedFly());
        ruDuck.performFly();

        System.out.println("----------------------");
        mDuck.performFly();
        reDuck.performFly();
    }
}
