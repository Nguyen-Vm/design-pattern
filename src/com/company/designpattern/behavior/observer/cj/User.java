package com.company.designpattern.behavior.observer.cj;

/**
 * @author RWM
 * @date 2018/10/9
 */
public class User implements Observer {
    private String name;
    private String message;
    private Subject subject;

    public User(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息:" + message);
    }
}
