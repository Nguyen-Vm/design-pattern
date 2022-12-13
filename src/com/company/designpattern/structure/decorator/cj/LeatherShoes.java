package com.company.designpattern.structure.decorator.cj;

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
