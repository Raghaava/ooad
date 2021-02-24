package Strategy;

import Strategy.flybehaviours.FlyWithWings;
import Strategy.quackbehaviour.NormalQuack;

public class MallardDuck extends Duck  {

    public MallardDuck() {
      flyBehaviour = new FlyWithWings();
      quackBehaviour = new NormalQuack();
    }

    @Override
    public void display() {
        System.out.println("I look like a MallardDuck.");
    }
}
