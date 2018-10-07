package org.linker._01_factory;

/**
 * @author RWM
 * @date 2018/10/7
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperation("/");
        operation.numberA = 1;
        operation.numberB = 2;
        double result = operation.getResult();
        System.out.println(result);
    }
}
