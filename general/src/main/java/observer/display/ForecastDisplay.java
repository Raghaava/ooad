package observer.display;

import observer.Subject;

public class ForecastDisplay extends Display {

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Forecast conditions are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
