package com.company.designpattern.behavior.observer.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float foreacast = temperature + humidity + pressure;
        if (foreacast < 100) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (foreacast < 150) {
            System.out.println("Forecast: Watch out for cooler, rainy weather!");
        } else {
            System.out.println("Forecast: More of the same!");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
