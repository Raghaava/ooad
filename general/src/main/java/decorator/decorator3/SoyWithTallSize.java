package decorator.decorator3;

public class SoyWithTallSize extends Soy {

    public SoyWithTallSize(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
