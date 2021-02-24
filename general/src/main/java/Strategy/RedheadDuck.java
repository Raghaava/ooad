package Strategy;

import Strategy.flybehaviours.FlyWithWings;
import Strategy.quackbehaviour.NormalQuack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new NormalQuack();
    }

    @Override
    public void display() {
        System.out.println("I look like RedheadDuck");
    }
}
