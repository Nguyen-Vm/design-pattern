package org.linker.观察者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(30, 35, 33.5f);
        System.out.println();
        weatherData.setMeasurements(60, 40, 57.6f);
    }
}
