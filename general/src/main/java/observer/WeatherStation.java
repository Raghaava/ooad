package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.Display;
import observer.display.ForecastDisplay;
import observer.display.PrivateDisplay;
import observer.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String... args) {

        WeatherData weatherData = new WeatherData();
        weatherData.setTemp(10);
        weatherData.setPressure(20);
        weatherData.setHumidity(30);

        Display display1 = new CurrentConditionsDisplay(weatherData);
        Display display2 = new ForecastDisplay(weatherData);
        Display display3 = new PrivateDisplay(weatherData);
        Display display4 = new StatisticsDisplay(weatherData);


        display1.subscribe();
        display2.subscribe();
        display3.subscribe();
        display4.subscribe();

        weatherData.measurementsChanged();
    }
}
