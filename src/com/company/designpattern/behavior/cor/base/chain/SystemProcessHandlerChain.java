package com.company.designpattern.behavior.cor.base.chain;

import com.company.designpattern.behavior.cor.base.BaseHandleChain;
import com.company.designpattern.behavior.cor.base.dto.SystemProcessContext;
import com.company.designpattern.behavior.cor.base.process.SystemProcessResultHandler;

import java.util.List;

/**
 * @author ryan
 * @date 2022/12/12
 */
// @Service
public class SystemProcessHandlerChain extends BaseHandleChain<SystemProcessResultHandler, SystemProcessContext, Void> {

    // @Autowired
    public SystemProcessHandlerChain(List<SystemProcessResultHandler> systemProcessResultHandlers) {
        super(systemProcessResultHandlers);
    }
}
