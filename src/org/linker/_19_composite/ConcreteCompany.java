package org.linker._19_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class ConcreteCompany extends Company {
    private List<Company> companies = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);
        for (Company company : companies) {
            company.display(depth + 2);
        }

    }

    @Override
    public void lineOfDuty() {
        for (Company company : companies) {
            company.lineOfDuty();
        }
    }

}
