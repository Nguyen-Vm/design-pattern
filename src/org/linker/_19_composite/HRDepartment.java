package org.linker._19_composite;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s,员工招聘培训管理师", name));
    }
}
