package command.composite_command;

import command.Command;

public class BlackAndWhiteCommand  implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
