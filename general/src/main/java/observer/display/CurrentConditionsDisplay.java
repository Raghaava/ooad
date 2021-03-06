package observer.display;

import observer.Subject;

public class CurrentConditionsDisplay extends Display {

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
      System.out.print("Current conditions are ");
      System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }


}
