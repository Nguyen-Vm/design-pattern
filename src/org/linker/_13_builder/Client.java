package org.linker._13_builder;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        director.construct(b1);
        b1.getResult().show();

        Builder b2 = new ConcreteBuilder2();
        director.construct(b2);
        b2.getResult().show();
    }
}
