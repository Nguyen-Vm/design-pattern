package org.linker._02_strategy.cash;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class Main {
    private static double total = 0.0d;

    /**
     * 新增商品类，给定价格和优惠类型，可实现每个商品享受不同的优惠
     */
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(200);
        prices.add(300);
        prices.add(500);
        checkoutFactory(prices, "打8折");
        checkoutStrategy(prices, "打8折");
        System.out.println(total);
    }

    /**
     * 简单工厂模式的用户
     * 客户需要端认识两个类，CashSuper和CashFactory
     * @param prices
     * @param type
     */
    private static void checkoutFactory(List<Integer> prices, String type) {
        CashSuper cs = CashFactory.createCashAccept(type);
        for (Integer price : prices) {
            double totalPrices = cs.acceptCash(price);
            total = total + totalPrices;
        }
    }

    /**
     * 策略模式与简单工厂模式结合的用法
     * 客户端只需要认识一个类CashContext。耦合度降低了！
     * @param prices
     * @param type
     */
    private static void checkoutStrategy(List<Integer> prices, String type) {
        CashContext cc = new CashContext(type);
        for (Integer price : prices) {
            double totalPrices = cc.getResult(price);
            total = total + totalPrices;
        }
    }
}
