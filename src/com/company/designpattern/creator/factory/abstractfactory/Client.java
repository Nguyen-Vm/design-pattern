package com.company.designpattern.creator.factory.abstractfactory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new AccessFactory();

        IUser iu = factory.createUser();
        User user = new User();
        iu.insert(user);
        iu.search("");

        IDepartment id = factory.createDepartment();
        Department department = new Department();
        id.insert(department);
        id.search("");
    }
}
