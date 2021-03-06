package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.PrivateDisplay;
import observer.display.StatisticsDisplay;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private int temp;
    private int humidity;
    private int pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void measurementsChanged() {
        observers.forEach(observer -> observer.update(temp, humidity, pressure));
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
