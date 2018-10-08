package org.linker._06_decorator;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Suit extends Finery {
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
