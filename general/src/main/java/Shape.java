public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract int calcArea();

    public void printName() {
        System.out.println(name);
    }
}
