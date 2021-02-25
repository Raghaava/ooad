package jdkobserver.display;

import java.util.Observable;

public class CurrentConditionsDisplay extends Display {

    public CurrentConditionsDisplay(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
      System.out.print("Current conditions are ");
      System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }


}
