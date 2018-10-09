package org.linker._15_abstract_factory.factory;

import org.linker._15_abstract_factory.IDepartment;
import org.linker._15_abstract_factory.IUser;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
