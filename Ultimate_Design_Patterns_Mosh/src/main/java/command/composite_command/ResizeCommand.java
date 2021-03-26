package command.composite_command;

import command.Command;

public class ResizeCommand  implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
