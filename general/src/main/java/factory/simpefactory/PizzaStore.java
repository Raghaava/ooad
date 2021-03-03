package factory.simpefactory;

import factory.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        prepare(pizza);
        bake(pizza);
        cut(pizza);
        box(pizza);

        return pizza;
    }

    public void prepare(Pizza pizza) {
        System.out.println("Preparing... "+pizza.getName());
    }

    public void bake(Pizza pizza) {
        System.out.println("Baking... "+pizza.getName());
    }

    public void cut(Pizza pizza) {
        System.out.println("Cutting... "+pizza.getName());
    }

    public void box(Pizza pizza) {
        System.out.println("Boxing... "+pizza.getName());
    }
}
