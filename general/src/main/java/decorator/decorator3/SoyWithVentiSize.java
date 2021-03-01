package decorator.decorator3;

public class SoyWithVentiSize extends Soy {
    public SoyWithVentiSize(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
