package Strategy;

import Strategy.flybehaviours.NoFly;
import Strategy.quackbehaviour.SilentQuack;

public class WoodenDecoyDucks extends Duck {

    public WoodenDecoyDucks() {
      flyBehaviour = new NoFly();
      quackBehaviour = new SilentQuack();
    }

    @Override
    public void display() {
        System.out.println("I look like wood");
    }
}
