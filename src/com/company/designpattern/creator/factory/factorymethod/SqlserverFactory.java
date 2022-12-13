package com.company.designpattern.creator.factory.factorymethod;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

}
