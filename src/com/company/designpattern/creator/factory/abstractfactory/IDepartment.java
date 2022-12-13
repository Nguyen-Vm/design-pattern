package com.company.designpattern.creator.factory.abstractfactory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface IDepartment {
    void insert(Department department);
    Department search(String id);
}
