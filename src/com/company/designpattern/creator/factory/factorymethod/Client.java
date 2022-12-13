package com.company.designpattern.creator.factory.factorymethod;

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
