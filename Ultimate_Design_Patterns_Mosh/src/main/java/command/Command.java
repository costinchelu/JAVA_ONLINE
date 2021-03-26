package command;

// COMMAND (abstract)
public interface Command {

    // the actual method that our framework can use to  get things done
    void execute();
}
