package com.company.designpattern.behavior.strategy.headfirst;

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
