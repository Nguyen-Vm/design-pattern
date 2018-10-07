package org.linker._02_strategy.region;

import org.linker._02_strategy.PriceRegion;

/**
 * @author RWM
 * @date 2018/6/1
 */
@PriceRegion(min = 2000, max = 3000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        return originPrice * 0.8;
    }
}
