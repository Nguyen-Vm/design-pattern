package com.company.designpattern.behavior.strategy.game.region;

import com.company.designpattern.behavior.strategy.game.PriceRegion;

/**
 * @author RWM
 * @date 2018/6/1
 */
@PriceRegion(max = 1000)
public class Origin implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice;
    }
}
