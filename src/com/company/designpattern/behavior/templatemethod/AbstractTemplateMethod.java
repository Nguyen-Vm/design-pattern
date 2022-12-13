package com.company.designpattern.behavior.templatemethod;

/**
 * @author ryan
 * @date 2022/12/13
 */
public abstract class AbstractTemplateMethod {

    public final void templateMethod() {
        preHandle();
        doHandle();
        afterHandle();
    }

    /**
     * 前置处理
     */
    protected abstract void preHandle();

    /**
     * 业务处理
     */
    protected abstract void doHandle();

    /**
     * 后置处理
     */
    protected abstract void afterHandle();
}
