package Strategy;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("I look like a MallardDuck.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
}
