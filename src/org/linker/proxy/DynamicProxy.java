package org.linker.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class DynamicProxy implements InvocationHandler {

    private final Object mTarget;// 被代理对象的引用

    public DynamicProxy(Object mTarget) {
        this.mTarget = mTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理对象的方法
        return method.invoke(mTarget, args);
    }
}
