package decorator.decorator1;

public class Bakery {
    public static void main(String... args) {
        Cake cake = new FruitCake(new ChocolateCake(new CakeEmbryo()));

        cake.make();
    }
}
