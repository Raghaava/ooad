package Strategy.flybehaviours;

public class RocketSpeedFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can fly at rocket speed!");
    }
}
