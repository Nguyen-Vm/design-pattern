package org.linker._08_factory_method;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Client {

    /**
     * 简单工厂模式的最大优点是在于工厂类中包含了必要的判断逻辑，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
     *
     * 工厂方法模式：定义了一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
     * 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。
     */
    public static void main(String[] args) {
        simpleFactory();
        factoryMethod();
    }

    private static void factoryMethod() {
        IFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }

    private static void simpleFactory() {
        LeiFeng leiFengA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        leiFengA.sweep();
        LeiFeng leiFengB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        leiFengB.wash();
        LeiFeng leiFengC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        leiFengC.buyRice();
    }
}
