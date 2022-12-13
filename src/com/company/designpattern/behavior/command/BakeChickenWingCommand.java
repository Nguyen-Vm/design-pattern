package com.company.designpattern.behavior.command;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
