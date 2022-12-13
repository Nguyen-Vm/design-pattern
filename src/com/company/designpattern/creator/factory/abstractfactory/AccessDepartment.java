package com.company.designpattern.creator.factory.abstractfactory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表增加了一条记录");
    }

    @Override
    public Department search(String id) {
        System.out.println("在Access中根据ID得到Department表一条记录");
        return null;
    }
}
