package com.company.designpattern.creator.factory.simplefactory;

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
