package org.linker._17_adapter;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class TargetImpl implements Target {
    @Override
    public void sampleOperation1() {
        System.out.println("TargetImpl -> sampleOperation1");
    }

    @Override
    public void sampleOperation2() {
        System.out.println("TargetImpl -> sampleOperation2");
    }
}
