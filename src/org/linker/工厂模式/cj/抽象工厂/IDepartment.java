package org.linker.工厂模式.cj.抽象工厂;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface IDepartment {
    void insert(Department department);
    Department search(String id);
}
