package org.linker.单例模式.head_first;

/**
 * @author RWM
 * @date 2018/11/5
 */
public class Singleton_1 {

    private static Singleton_1 instance = new Singleton_1();

    private Singleton_1() {}

    public static Singleton_1 getInstance() {
        return instance;
    }
}
