package org.linker.装饰者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 30;
    }
}
