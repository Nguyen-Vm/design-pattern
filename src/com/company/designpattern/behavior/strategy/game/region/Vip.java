package com.company.designpattern.behavior.strategy.game.region;

import com.company.designpattern.behavior.strategy.game.PriceRegion;

/**
 * @author RWM
 * @date 2018/6/1
 */
@PriceRegion(min = 1000, max = 2000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.9;
    }
}
