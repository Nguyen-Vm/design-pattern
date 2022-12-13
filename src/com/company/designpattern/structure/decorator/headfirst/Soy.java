package com.company.designpattern.structure.decorator.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }
}
