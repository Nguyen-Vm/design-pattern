package org.linker.策略模式.cj;

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
