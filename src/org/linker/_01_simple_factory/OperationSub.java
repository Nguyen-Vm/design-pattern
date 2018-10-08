package org.linker._01_simple_factory;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class OperationSub extends Operation {

    @Override
    public double getNumberA() {
        double result = numberA - numberB;
        return result;
    }
}
