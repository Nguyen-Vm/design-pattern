package com.company.designpattern.behavior.cor;

/**
 * @author RWM
 * @date 2018/10/10
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
