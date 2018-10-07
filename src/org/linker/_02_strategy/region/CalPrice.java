package org.linker._02_strategy.region;

/**
 * @author RWM
 * @date 2018/6/1
 */
public interface CalPrice {
    // 根据原价返回一个最终的价格
    Double calPrice(Double originPrice);

}
