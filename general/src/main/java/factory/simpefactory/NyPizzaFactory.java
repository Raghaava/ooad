package factory.simpefactory;

import factory.pizza.Pizza;
import factory.pizza.ny.NyCheesePizza;
import factory.pizza.ny.NyClamPizza;
import factory.pizza.ny.NyPepperoniPizza;
import factory.pizza.ny.NyVeggiePizza;

public class NyPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
           return new NyCheesePizza();
        }
        else if(type.equals("pepperoni")) {
            return new NyPepperoniPizza();
        }
        else if(type.equals("clam")) {
            return new NyClamPizza();
        }
        else if(type.equals("veggie")) {
            return new NyVeggiePizza();
        }
        return super.createPizza(type);
    }
}
