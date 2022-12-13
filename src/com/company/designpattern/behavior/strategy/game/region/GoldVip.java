package com.company.designpattern.behavior.strategy.game.region;

import com.company.designpattern.behavior.strategy.game.PriceRegion;

/**
 * @author RWM
 * @date 2018/6/1
 */
@PriceRegion(min = 3000)
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.7;
    }
}
