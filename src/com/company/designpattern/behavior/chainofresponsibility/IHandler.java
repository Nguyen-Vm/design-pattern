package com.company.designpattern.behavior.chainofresponsibility;

/**
 * @author 阮威敏
 * @date 2023/6/5
 */
public interface IHandler {
    /**
     * 逻辑处理
     *
     * @return 是否处理完成，返回TRUE时，链路执行结束。
     */
    boolean handle();
}
