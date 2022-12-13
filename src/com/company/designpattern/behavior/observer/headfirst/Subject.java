package com.company.designpattern.behavior.observer.headfirst;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
