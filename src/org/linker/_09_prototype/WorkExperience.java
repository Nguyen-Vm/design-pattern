package org.linker._09_prototype;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class WorkExperience implements Cloneable {
    public String timeArea;
    public String company;

    @Override
    protected Object clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;
    }
}
