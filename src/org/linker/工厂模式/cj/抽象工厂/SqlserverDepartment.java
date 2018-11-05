package org.linker.工厂模式.cj.抽象工厂;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class SqlserverDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department表增加了一条记录");
    }

    @Override
    public Department search(String id) {
        System.out.println("在SQL Server中根据ID得到Department表一条记录");
        return null;
    }
}
