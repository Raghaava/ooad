package jdkobserver.display;


import jdkobserver.WeatherData;

import java.util.Observable;
import java.util.Observer;

public abstract class Display implements Observer {
    protected int temp;
    protected int humidity;
    protected int pressure;

    protected Observable subject;

    public void update(Observable observable, Object org) {
        WeatherData weatherData = (WeatherData)observable;
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    public void subscribe() {
        subject.addObserver(this);
    }

    public void unsubscribe() {
        subject.deleteObserver(this);
    }

    public abstract void display();
}
