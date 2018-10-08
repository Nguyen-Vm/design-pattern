package org.linker._07_proxy.gift;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Proxy implements GiveGift {
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
