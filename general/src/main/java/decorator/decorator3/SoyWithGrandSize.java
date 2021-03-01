package decorator.decorator3;

public class SoyWithGrandSize extends Soy {
    public SoyWithGrandSize(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
