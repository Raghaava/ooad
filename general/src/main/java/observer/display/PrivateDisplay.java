package observer.display;

public class PrivateDisplay extends Display {
    @Override
    public void display() {
        System.out.print("Private Display: ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
