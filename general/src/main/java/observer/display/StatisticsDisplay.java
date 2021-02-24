package observer.display;

public class StatisticsDisplay extends Display {
    @Override
    public void display() {
        System.out.print("Statistics are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
