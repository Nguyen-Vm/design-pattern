package org.linker._15_abstract_factory;

/**
 * @author RWM
 * @date 2018/10/9
 */
public interface IDepartment {
    void insert(Department department);
    Department search(String id);
}
