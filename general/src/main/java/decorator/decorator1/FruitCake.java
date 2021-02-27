package decorator.decorator1;

public class FruitCake extends DecorateCake {
    public FruitCake(Cake cake) {
        super(cake);
    }

    @Override
    public void make() {
        super.make();
        addFruits();
    }

    private void addFruits() {
        System.out.println("Add fruits!");
    }
}
