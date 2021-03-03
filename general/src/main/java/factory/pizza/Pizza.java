package factory.pizza;

public abstract class Pizza {
    protected String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing... "+name);
    }

    public void bake() {
        System.out.println("Baking... "+name);
    }

    public void cut() {
        System.out.println("Cutting... "+name);
    }

    public void box() {
        System.out.println("Boxing... "+name);
    }
}
