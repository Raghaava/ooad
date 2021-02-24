package observer;

public class WeatherStation {
    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setTemp(10);
        weatherData.setPressure(20);
        weatherData.setHumidity(30);

        weatherData.measurementsChanged();
    }
}
