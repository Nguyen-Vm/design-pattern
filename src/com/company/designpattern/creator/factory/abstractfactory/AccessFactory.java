package com.company.designpattern.creator.factory.abstractfactory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
