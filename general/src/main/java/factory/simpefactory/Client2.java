package factory.simpefactory;

import factory.pizza.Pizza;

public class Client2 {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new ChicagoPizzaFactory();
        Pizza pizza  = simplePizzaFactory.createPizza("veggie");

        pizza.bake();
        pizza.box();
    }
}
