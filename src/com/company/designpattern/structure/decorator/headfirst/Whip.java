package com.company.designpattern.structure.decorator.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }
}
