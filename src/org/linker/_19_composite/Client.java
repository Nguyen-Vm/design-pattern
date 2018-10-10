package org.linker._19_composite;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany sh = new ConcreteCompany("上海华东分公司");
        sh.add(new HRDepartment("华东分公司人力资源"));
        sh.add(new FinanceDepartment("华东分公司财务部"));
        root.add(sh);

        ConcreteCompany nj = new ConcreteCompany("南京办事处");
        nj.add(new HRDepartment("南京办事处人力资源"));
        nj.add(new FinanceDepartment("南京办事处财务部"));
        sh.add(nj);

        ConcreteCompany hz = new ConcreteCompany("杭州办事处");
        hz.add(new HRDepartment("杭州办事处人力资源"));
        hz.add(new FinanceDepartment("杭州办事处财务部"));
        sh.add(hz);

        System.out.println("结构图:");
        root.display(1);

        System.out.println();

        System.out.println("职责:");
        root.lineOfDuty();

    }
}
