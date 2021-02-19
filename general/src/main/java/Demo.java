public class Demo {
    public static void main(String[] args) {
        Shape shape1 = new Square("Square");
        Shape shape2 = new Triangle("Triangle");

        Bounceable bounce = (Bounceable) shape2;

        shape1.printName();
        shape2.printName();

        System.out.println(shape1.calcArea());
        System.out.println(shape2.calcArea());

        bounce.bounce();
    }
}
