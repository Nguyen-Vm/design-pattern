package com.company.designpattern.structure.decorator.headfirst;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class Client {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " ￥" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " ￥" + houseBlend.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription() + " ￥" + darkRoast.cost());
    }
}
