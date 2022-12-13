package com.company.designpattern.behavior.cor.base.process.impl;

import com.company.designpattern.behavior.cor.base.HandleResult;
import com.company.designpattern.behavior.cor.base.dto.SystemProcessContext;
import com.company.designpattern.behavior.cor.base.process.SystemProcessResultHandler;

/**
 * @author ryan
 * @date 2022/12/12
 */
// @Service
public class SystemApproveHandler implements SystemProcessResultHandler {

    @Override
    public HandleResult<Void> doHandle(SystemProcessContext context) {
        return null;
    }
}
