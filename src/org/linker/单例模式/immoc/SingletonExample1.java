package org.linker.单例模式.immoc;

/**
 * @author RWM
 * @date 2018/4/25
 * @description:
 */


/**
 * 懒汉模式
 * 单例实例在第一次使用时进行创建
 */
//@NotThreadSafe
public class SingletonExample1 {

    // 私有构造函数
    private SingletonExample1() {

    }

    // 单例对象
    private static SingletonExample1 instance = null;

    // 静态的工厂方法
    public static SingletonExample1 getInstance() {
        if (null == instance) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
