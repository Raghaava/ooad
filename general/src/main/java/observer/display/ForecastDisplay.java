package observer.display;

public class ForecastDisplay extends Display {
    @Override
    public void display() {
        System.out.print("Forecast conditions are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
