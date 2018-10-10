package org.linker._17_adapter;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void sampleOperation2() {
        System.out.println("adapter -> sampleOperation2");
    }
}
