package com.company.designpattern.creator.factory.abstractfactory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface IUser {
    void insert(User user);
    User search(String id);
}
