package org.linker.工厂模式.cj.工厂方法;

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
