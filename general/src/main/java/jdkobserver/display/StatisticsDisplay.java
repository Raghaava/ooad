package jdkobserver.display;

import java.util.Observable;

public class StatisticsDisplay extends Display {

    public StatisticsDisplay(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Statistics are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
