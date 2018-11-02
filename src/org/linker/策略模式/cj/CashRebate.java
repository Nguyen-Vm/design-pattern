package org.linker.策略模式.cj;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class CashRebate extends CashSuper {
    private double moneyRebate;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
