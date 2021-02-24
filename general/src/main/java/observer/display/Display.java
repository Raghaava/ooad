package observer.display;

public abstract class Display {
    protected int temp;
    protected int humidity;
    protected int pressure;

    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public abstract void display();
}
