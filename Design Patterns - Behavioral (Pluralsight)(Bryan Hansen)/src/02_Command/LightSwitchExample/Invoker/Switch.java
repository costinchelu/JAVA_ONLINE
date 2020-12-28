package LightSwitchExample.Invoker;

import LightSwitchExample.CommandBase.Command;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}
