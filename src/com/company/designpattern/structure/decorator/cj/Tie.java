package com.company.designpattern.structure.decorator.cj;

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
