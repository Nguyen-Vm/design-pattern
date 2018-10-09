package org.linker._15_abstract_factory.factory_method;


import org.linker._15_abstract_factory.IUser;
import org.linker._15_abstract_factory.SqlserverUser;

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
