package com.company.designpattern.structure.decorator.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 20;
    }
}
