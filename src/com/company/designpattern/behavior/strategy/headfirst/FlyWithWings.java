package com.company.designpattern.behavior.strategy.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
