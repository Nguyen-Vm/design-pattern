package org.linker.观察者模式.head_first;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
