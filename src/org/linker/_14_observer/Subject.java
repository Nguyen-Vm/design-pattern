package org.linker._14_observer;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
