package com.company.designpattern.behavior.strategy.cj;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
