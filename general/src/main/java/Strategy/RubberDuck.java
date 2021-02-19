package Strategy;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }

    @Override
    void display() {
        System.out.println("I look like RubberDuck.");
    }
}
