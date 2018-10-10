package org.linker._23_command;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
