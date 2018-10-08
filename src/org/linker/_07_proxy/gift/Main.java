package org.linker._07_proxy.gift;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
