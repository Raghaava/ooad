package factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        PizzaStore store = new NyPizzaStore();

        store.orderPizza("veggie");
    }
}
