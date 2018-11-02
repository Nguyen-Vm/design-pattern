package org.linker.装饰者模式.head_first;

/**
 * @author RWM
 * @date 2018/11/2
 */
public class CLient {
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
