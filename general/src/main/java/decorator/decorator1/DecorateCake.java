package decorator.decorator1;

public abstract class DecorateCake implements Cake {
    protected Cake cake;

    protected DecorateCake(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void make() {
        cake.make();
    }
}
