package factory.staticfactory;

public class Client {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        store.orderPizza("veggie");
    }
}
