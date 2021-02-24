package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.PrivateDisplay;
import observer.display.StatisticsDisplay;

public class WeatherData {
    private int temp;
    private int humidity;
    private int pressure;

    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;
    private PrivateDisplay privateDisplay;

    public WeatherData() {
        currentConditionsDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
        privateDisplay = new PrivateDisplay();
    }

    public void measurementsChanged() {
        currentConditionsDisplay.update(temp, pressure, humidity);
        statisticsDisplay.update(temp, pressure, humidity);
        forecastDisplay.update(temp, pressure, humidity);
        privateDisplay.update(temp, pressure, humidity);
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
