package com.company.designpattern.behavior.strategy.cj;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
        return cs;
    }
}
