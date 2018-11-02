package org.linker.策略模式.game;

import org.linker.策略模式.game.region.CalPrice;
import org.linker.策略模式.game.region.Origin;

/**
 * @author RWM
 * @date 2018/6/1
 */
public class Player {

    private Double totalAmount = 0D;// 客户在鹅厂消费的总额
    private Double amount = 0D;// 客户单次消费金额

    private CalPrice calPrice = new Origin();// 每个客户都有一个计算价格的策略，初始都是普通计算，即原价

    // 客户购买皮肤，就会增加它的总额
    public void buy(Double amount) {
        this.amount = amount;
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }

    // 计算客户最终要付的钱
    public Double calLastAmount() {
        Double payAmount = calPrice.calPrice(amount);
        this.amount = payAmount;
        totalAmount += payAmount;
        return payAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}
