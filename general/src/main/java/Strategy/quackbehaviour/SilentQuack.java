package Strategy.quackbehaviour;

public class SilentQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am silent");
    }
}
