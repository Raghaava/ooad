package factory.test;

import factory.factorymethod.NyPizzaStore;
import factory.factorymethod.PizzaStore;

public class Client {
    public static void main(String[] args) {
        PizzaStore store = new NyPizzaStore();

        store.orderPizza("veggie");
    }
}
