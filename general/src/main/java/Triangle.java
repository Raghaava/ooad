public class Triangle extends Shape implements Bounceable {
    public Triangle(String name) {
        super(name);
    }
    public int calcArea() {
        return 0;
    }

    @Override
    public void bounce() {
        System.out.println(this.name +" is bouncing.");
    }
}
