package org.linker.策略模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
