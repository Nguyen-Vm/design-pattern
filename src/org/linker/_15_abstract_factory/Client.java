package org.linker._15_abstract_factory;

import org.linker._15_abstract_factory.factory.AccessFactory;
import org.linker._15_abstract_factory.factory.IFactory;
import org.linker._15_abstract_factory.factory_method.SqlserverFactory;
import org.linker._15_abstract_factory.simple_factory.DataAccess;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 如果要换数据库，只需要把new SqlserverFactory()改成new AccessFactory()
         */
        factoryMethod();


        /**
         * 只有一个User类和User操作类的时候，是只需要工厂模式的，
         * 但数据库有很多表，而SQL Server和Access又是两大不同的分类，
         * 所以解决涉及多产品系列的问题，有一个专门的工厂模式叫抽象工厂模式。
         */
        abstractFactory();

        /**
         * 抽象工厂模式太多工厂类，添加一张表要改多个工厂类，不如直接用一个简单工厂来实现。
         * 缺点是如果添加数据库，就需要在switch中加case了。
         */
        simpleFactory();
    }


    private static void factoryMethod() {
        System.out.println("----------工厂方法模式----------");

        org.linker._15_abstract_factory.factory_method.IFactory factory = new SqlserverFactory();

        IUser iu = factory.createUser();

        User user = new User();
        iu.insert(user);
        iu.search("");

        System.out.println();
    }


    private static void abstractFactory() {
        System.out.println("----------抽象工厂模式----------");

        IFactory factory = new AccessFactory();

        IUser iu = factory.createUser();
        User user = new User();
        iu.insert(user);
        iu.search("");

        IDepartment id = factory.createDepartment();
        Department department = new Department();
        id.insert(department);
        id.search("");

        System.out.println();
    }

    private static void simpleFactory() {
        System.out.println("----------简单工厂模式----------");

        IUser iu = DataAccess.createUser();

        User user = new User();
        iu.insert(user);
        iu.search("");

        IDepartment id = DataAccess.createDepartment();

        Department department = new Department();
        id.insert(department);
        id.search("");

        System.out.println();
    }
}
