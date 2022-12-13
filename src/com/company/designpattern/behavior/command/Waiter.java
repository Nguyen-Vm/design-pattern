package com.company.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.getClass().getName() + " 时间：" + new Date());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.getClass().getName() + " 时间：" + new Date());
    }

    public void notifyReceiver() {
        for (Command command : orders) {
            command.executeCommand();
        }
    }
}
