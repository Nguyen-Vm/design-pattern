package com.company.designpattern.structure.decorator.cj;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Client {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("---------------");
        System.out.println("第一种装扮：");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        sneakers.decorate(xc);
        tShirts.decorate(sneakers);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();

        System.out.println("---------------");
        System.out.println("第二种装扮：");

        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes leatherShoes = new LeatherShoes();

        leatherShoes.decorate(xc);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }
}
