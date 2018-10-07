package org.linker._01_factory;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0");
        }
        double result = numberA / numberB;
        return result;
    }
}
