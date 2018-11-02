package org.linker.装饰者模式.cj;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
