package org.linker.工厂模式.cj.简单工厂;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {

    public static void main(String[] args) {
        IUser iu = UserFactory.createUser("SQL Server");

        User user = new User();
        iu.insert(user);
        iu.search("");
    }
}
