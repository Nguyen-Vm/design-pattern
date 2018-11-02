package org.linker.装饰者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
