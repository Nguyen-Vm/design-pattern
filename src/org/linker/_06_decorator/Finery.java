package org.linker._06_decorator;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
