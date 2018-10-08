package org.linker._09_prototype;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private int age;
    private WorkExperience work;


    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    public void setPersonInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        work.timeArea = timeArea;
        work.company = company;
    }

    public void display() {
        System.out.println(String.format("%s, %s, %s", name, sex, age));
        System.out.println(String.format("工作经历： %s, %s", work.timeArea, work.company));
    }

    @Override
    public Object clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        resume.work = (WorkExperience) work.clone();
        return resume;
    }
}
