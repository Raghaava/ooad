package decorator.decorator3;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public void printName() {
        System.out.println(this.getDescription());
    }
}
