package org.linker._13_builder;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
