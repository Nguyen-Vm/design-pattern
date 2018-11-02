package org.linker.单例模式;

/**
 * @author RWM
 * @date 2018/4/25
 * @description:
 */


/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
//@ThreadSafe
public class SingletonExample6 {

    // 私有构造函数
    private SingletonExample6() {

    }

    // 静态域、单例对象 -> 需要放在静态块之前，不然main函数会发生NullPointerException
    private static SingletonExample6 instance = null;

    // 静态块
    static {
        instance = new SingletonExample6();
    }

    // 静态的工厂方法
    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
