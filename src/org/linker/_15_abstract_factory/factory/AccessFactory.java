package org.linker._15_abstract_factory.factory;

import org.linker._15_abstract_factory.AccessDepartment;
import org.linker._15_abstract_factory.AccessUser;
import org.linker._15_abstract_factory.IDepartment;
import org.linker._15_abstract_factory.IUser;

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
