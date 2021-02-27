package decorator;

import decorator.condiments.Condiment;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    protected String name;
    protected double basePrice;
    private List<Condiment> condiments;

    public Beverage(String description, double basePrice) {
        this.basePrice = basePrice;
        this.name = description;
        condiments = new ArrayList<>();
    }

    public void withCondiment(Condiment condiment) {
        condiments.add(condiment);
    }

    public void withoutCondiment(Condiment condiment) {
        condiments.remove(condiment);
    }

    public double getTotal() {
        return condiments.stream().mapToDouble(Condiment::getPrice).reduce(this.basePrice, (a,b) -> a+b);
    }

    public String getDescription() {
        return condiments.stream().map(Condiment::getName).reduce(name, (a, b) -> a.concat(", ".concat(b)));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
