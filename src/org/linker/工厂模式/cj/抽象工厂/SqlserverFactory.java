package org.linker.工厂模式.cj.抽象工厂;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
