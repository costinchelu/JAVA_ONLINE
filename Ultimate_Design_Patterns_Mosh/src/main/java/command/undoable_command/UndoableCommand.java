package command.undoable_command;

import command.Command;

public interface UndoableCommand extends Command {
    void unExecute();
}
