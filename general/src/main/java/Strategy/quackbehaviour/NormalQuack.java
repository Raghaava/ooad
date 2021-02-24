package Strategy.quackbehaviour;

public class NormalQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am quacking.");
    }
}
