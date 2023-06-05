package com.company.designpattern.behavior.chainofresponsibility;

/**
 * @author 阮威敏
 * @date 2023/6/5
 */
public class HandlerB implements IHandler {

    @Override
    public boolean handle() {
        System.out.println("B handle");
        return false;
    }
}
