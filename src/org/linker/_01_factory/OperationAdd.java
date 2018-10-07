package org.linker._01_factory;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = numberA + numberB;
        return result;
    }
}
