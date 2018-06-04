package org.linker.proxy;

/**
 * @author RWM
 * @date 2018/6/4
 */
public class ProxyBuyer implements Ishop {
    private Ishop mshop;

    public ProxyBuyer(Ishop shop) {
        mshop = shop;
    }

    @Override
    public void buy() {
        mshop.buy();
    }
}
