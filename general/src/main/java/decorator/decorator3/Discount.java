package decorator.decorator3;

public class Discount {
    public double calcDiscount(Beverage blend) {
        return blend.cost() - .10;
    }
}
