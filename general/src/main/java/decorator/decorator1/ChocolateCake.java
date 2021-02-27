package decorator.decorator1;

public class ChocolateCake extends DecorateCake {
    public ChocolateCake(Cake cake) {
        super(cake);
    }

    @Override
    public void make() {
        addChocolate();
        super.make();
    }

    private void addChocolate() {
        System.out.println("Add chocolate!");
    }
}
