package command;

// INVOKER
public class Button {

    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    // when we click the button, something is happening, but what is happening will be determined
    // by the implementation of command
    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
