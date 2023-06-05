package com.company.designpattern.behavior.chainofresponsibility;

/**
 * @author 阮威敏
 * @date 2023/6/5
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
