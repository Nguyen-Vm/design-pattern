package org.linker._14_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class WechatServer implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setInformation(String message) {
        this.message = message;
        System.out.println("微信服务更新消息:" + message);
        notifyObserver();
    }
}
