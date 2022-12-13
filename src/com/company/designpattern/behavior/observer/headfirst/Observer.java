package com.company.designpattern.behavior.observer.headfirst;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
