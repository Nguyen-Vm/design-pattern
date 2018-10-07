package org.linker._01_factory;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = numberA * numberB;
        return result;
    }
}
