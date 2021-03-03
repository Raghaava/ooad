package factory.factorymethod;

import factory.pizza.Pizza;
import factory.pizza.chicago.ChicagoCheesePizza;
import factory.pizza.chicago.ChicagoClamPizza;
import factory.pizza.chicago.ChicagoPepperoniPizza;
import factory.pizza.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
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
        return null;
    }
}
