package org.linker._06_decorator;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Tie extends Finery {
    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}
