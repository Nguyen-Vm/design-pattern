package com.company.designpattern.creator.singleton.headfirst;

/**
 * @author RWM
 * @date 2018/11/5
 */
public class Singleton_3 {

    private volatile static Singleton_3 instance;

    private Singleton_3() {}

    public static Singleton_3 getInstance() {
        if (instance == null) {
            synchronized (Singleton_3.class) {
                if (instance == null) {
                    instance = new Singleton_3();
                }
            }
        }
        return instance;
    }
}
