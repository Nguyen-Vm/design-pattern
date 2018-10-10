package org.linker._23_command;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class Client {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(boy);
        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeChickenWingCommand);

        girl.notifyReceiver();
    }
}
