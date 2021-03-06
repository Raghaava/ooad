package observer.display;

import observer.Subject;

public class StatisticsDisplay extends Display {

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Statistics are ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
