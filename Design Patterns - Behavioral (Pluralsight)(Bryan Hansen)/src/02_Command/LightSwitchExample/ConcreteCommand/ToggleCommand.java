package LightSwitchExample.ConcreteCommand;

import LightSwitchExample.CommandBase.Command;
import LightSwitchExample.Receiver.Light;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}

/*
First implementation:

public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}


 */