package decorator.decorator3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Discount discount = new Discount();
        HouseBlend blend = new HouseBlend();
        Mocha mocha = new Mocha(new SoyWithGrandSize(blend));
        System.out.println(mocha.cost());
        mocha.printName();
    }
}
