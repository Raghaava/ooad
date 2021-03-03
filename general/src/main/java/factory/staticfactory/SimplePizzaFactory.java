package factory.staticfactory;

import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.PepperoniPizza;
import factory.pizza.Pizza;
import factory.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("Cheese")) {
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }
        else if(type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
