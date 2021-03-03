package factory.simpefactory;

import factory.pizza.Pizza;
import factory.pizza.chicago.ChicagoCheesePizza;
import factory.pizza.chicago.ChicagoClamPizza;
import factory.pizza.chicago.ChicagoPepperoniPizza;
import factory.pizza.chicago.ChicagoVeggiePizza;
import factory.pizza.ny.NyCheesePizza;
import factory.pizza.ny.NyClamPizza;
import factory.pizza.ny.NyPepperoniPizza;
import factory.pizza.ny.NyVeggiePizza;

public class ChicagoPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
           return new ChicagoCheesePizza();
        }
        else if(type.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        }
        else if(type.equals("clam")) {
            return new ChicagoClamPizza();
        }
        else if(type.equals("veggie")) {
            return new ChicagoVeggiePizza();
        }
        return super.createPizza(type);
    }
}
