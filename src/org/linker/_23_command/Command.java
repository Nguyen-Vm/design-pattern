package org.linker._23_command;

/**
 * @author RWM
 * @date 2018/10/10
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
