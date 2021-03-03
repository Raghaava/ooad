package factory.simpefactory;

public class Client {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new NyPizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);

        store.orderPizza("veggie");
    }
}
