package com.company.designpattern.behavior.cor.base;

import java.util.List;

/**
 * 基础处理链，各业务类型继承该基础接口
 *
 * @author ryan
 * @date 2022/12/12
 */
public class BaseHandleChain<Handler extends BaseHandler<Param, Result>, Param, Result> {

    /**
     * 处理节点列表
     */
    private final List<Handler> handlerList;

    public BaseHandleChain(List<Handler> handlerList) {
        this.handlerList = handlerList;
    }

    /**
     * 链式处理流程，需要处理的各节点，一次执行处理逻辑
     *
     * @param param
     * @return
     */
    public Result handleChain(Param param) {
        for (Handler handler : handlerList) {
            if (!handler.isHandler(param)) {
                continue;
            }
            HandleResult<Result> result = handler.doHandle(param);
            if (!result.isNext()) {
                continue;
            }
            return result.getData();
        }
        return null;
    }
}
