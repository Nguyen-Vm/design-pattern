package org.linker._20_bridge;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        HandsetBrand brand = new HandsetBrandM();
        brand.setSoft(new HandsetGame());
        brand.run();

        brand.setSoft(new HandsetAddressList());
        brand.run();

        brand = new HandsetBrandN();
        brand.setSoft(new HandsetGame());
        brand.run();

        brand.setSoft(new HandsetAddressList());
        brand.run();

    }
}
