package org.linker._07_proxy.gift;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + ",送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你巧克力");
    }
}
