package org.linker._25_mediator;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class USA extends Contury {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方消息:" + message);
    }
}
