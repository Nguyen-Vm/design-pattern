package org.linker.观察者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Avg/Max/Min temperature = %s/%s/%s!", temperature, temperature, temperature));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}
