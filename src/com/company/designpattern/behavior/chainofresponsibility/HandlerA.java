package com.company.designpattern.behavior.chainofresponsibility;

/**
 * @author 阮威敏
 * @date 2023/6/5
 */
public class HandlerA implements IHandler {

    @Override
    public boolean handle() {
        System.out.println("A handle");
        System.out.println("A finished");
        return true;
    }
}
