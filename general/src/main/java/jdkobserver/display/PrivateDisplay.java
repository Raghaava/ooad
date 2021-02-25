package jdkobserver.display;

import java.util.Observable;

public class PrivateDisplay extends Display {

    public PrivateDisplay(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.print("Private Display: ");
        System.out.println(this.temp + "-" + this.humidity + "-" + this.pressure);
    }
}
