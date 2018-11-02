package org.linker.装饰者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
