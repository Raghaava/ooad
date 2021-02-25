package observer.display;

import observer.Observer;
import observer.Subject;

public abstract class Display implements Observer {
    protected int temp;
    protected int humidity;
    protected int pressure;

    protected Subject subject;

    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void subscribe() {
        subject.registerObserver(this);
    }

    public void unsubscribe() {
        subject.registerObserver(this);
    }

    public abstract void display();
}
