package com.company.designpattern.structure.adapter;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();

        TargetImpl target = new TargetImpl();
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
