package LightSwitchExample.Client;

import LightSwitchExample.CommandBase.Command;
import LightSwitchExample.ConcreteCommand.AllLightsCommand;
import LightSwitchExample.ConcreteCommand.ToggleCommand;
import LightSwitchExample.Invoker.Switch;
import LightSwitchExample.Receiver.Light;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Light livingRoomLight = new Light();

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        lights.add(livingRoomLight);

        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
