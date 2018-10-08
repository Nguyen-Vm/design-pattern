package org.linker._06_decorator;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class LeatherShoes extends Finery {
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}
