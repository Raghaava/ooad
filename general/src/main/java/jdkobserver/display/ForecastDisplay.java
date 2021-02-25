package jdkobserver.display;

import java.util.Observable;

public class ForecastDisplay extends Display {

    public ForecastDisplay(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Forecast conditions are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
