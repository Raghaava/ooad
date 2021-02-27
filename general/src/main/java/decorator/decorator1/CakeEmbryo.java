package decorator.decorator1;

public class CakeEmbryo implements Cake {
    @Override
    public void make() {
        System.out.println("Baking cakes ");
    }
}
