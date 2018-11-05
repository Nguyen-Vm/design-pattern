package org.linker.工厂模式.cj.工厂方法;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new SqlserverFactory();

        IUser iu = factory.createUser();

        User user = new User();
        iu.insert(user);
        iu.search("");
    }
}
