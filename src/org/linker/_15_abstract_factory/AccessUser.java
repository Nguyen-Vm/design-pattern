package org.linker._15_abstract_factory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表增加了一条记录");
    }

    @Override
    public User search(String id) {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
