package com.company.designpattern.structure.decorator.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 25;
    }
}
