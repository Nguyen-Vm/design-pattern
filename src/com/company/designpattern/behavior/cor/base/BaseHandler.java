package com.company.designpattern.behavior.cor.base;

/**
 * 基础处理节点，各业务类型继承该基础接口
 *
 * @author ryan
 * @date 2022/12/12
 */
public interface BaseHandler<Param, Result> {

    /**
     * 节点处理业务逻辑，由子类实现
     *
     * @param param
     * @return
     */
    HandleResult<Result> doHandle(Param param);

    /**
     * 是否需要该节点处理，默认需要
     *
     * @param param
     * @return
     */
    default boolean isHandler(Param param) {
        return true;
    }
}
