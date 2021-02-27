package decorator;

import decorator.condiments.Cinnamon;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.SteamedMilk;

public class StarBuzz {
    public static void main(String... args) {
        Beverage beverage = new Espresso(4.5d);
        beverage.withCondiment(new SteamedMilk(0.6d));
        beverage.withCondiment(new Mocha(0.2d));
        beverage.withCondiment(new Mocha(0.2d));
        beverage.withCondiment(new Soy(1d));
        beverage.withCondiment(new Cinnamon(0.1d));

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getTotal());

        Beverage beverage2 = new IcedTea(2d);
        beverage2.withCondiment(new SteamedMilk(0.6d));
        beverage2.withCondiment(new Mocha(0.2d));

        System.out.println(beverage2.getTotal());
    }
}
