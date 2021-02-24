package Strategy;

import Strategy.flybehaviours.NoFly;
import Strategy.quackbehaviour.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I look like RubberDuck.");
    }
}
