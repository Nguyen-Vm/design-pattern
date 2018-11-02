package org.linker.策略模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
