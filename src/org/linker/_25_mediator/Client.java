package org.linker._25_mediator;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        UnitedNationSecurityCouncil unsc = new UnitedNationSecurityCouncil();
        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setUsa(usa);
        unsc.setIraq(iraq);

        usa.declare("不准研制核武器，否则发动战争");
        iraq.declare("我们没有核武器，也不怕侵犯");
    }
}
