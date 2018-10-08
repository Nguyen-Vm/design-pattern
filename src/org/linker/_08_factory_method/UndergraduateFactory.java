package org.linker._08_factory_method;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
