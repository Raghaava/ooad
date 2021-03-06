package observer.display;

import observer.Subject;

public class PrivateDisplay extends Display {

    public PrivateDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Private Display: ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
