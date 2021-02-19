package Strategy;

public class SimUDuck {
    public static void main(String... args) {
        Duck mDuck = new MallardDuck();
        Duck reDuck = new RedheadDuck();
        Duck ruDuck = new RubberDuck();

        ruDuck.swim();
        ruDuck.quack();
        ruDuck.display();
        ruDuck.fly();
    }
}
