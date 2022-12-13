package com.company.designpattern.structure.decorator.cj;

/**
 * @author RWM
 * @date 2018/10/8
 */
public class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(String.format("装扮的%s", name));
    }
}
