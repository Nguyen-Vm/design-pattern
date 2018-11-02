package org.linker.策略模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model dick!");
    }
}
