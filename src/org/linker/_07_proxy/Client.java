package org.linker._07_proxy;

import java.lang.reflect.Proxy;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class Client {

    public static void main(String[] args) {

        /*
         * 代理类和被代理类实现相同的接口，代理类持有被代理类的引用，代理方法执行时，同步调用被代理类的相同方法。
         * */

        staticProxy();
        dynamicProxy();

    }

    public static void staticProxy() {

        // 构造被代理类小明
        Ishop xiaoMing = new XiaoMing();
        // 创建代购者，并将xiaoMing作为构造函数传入
        Ishop proxyBuyer = new ProxyBuyer(xiaoMing);

        proxyBuyer.buy();
    }

    public static void dynamicProxy() {

        // 构造被代理类小明
        Ishop xiaoMing = new XiaoMing();
        // 获取被代理类小明的classLoader
        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();
        // 构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMing);
        // 动态构建代购的人
        Ishop proxyBuyer = (Ishop) Proxy.newProxyInstance(classLoader, new Class[] {Ishop.class}, dynamicProxy);
        // 进行代购
        proxyBuyer.buy();
    }

}
