package com.company.designpattern.behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阮威敏
 * @date 2023/6/5
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
