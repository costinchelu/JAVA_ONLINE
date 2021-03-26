package command;

import command.composite_command.BlackAndWhiteCommand;
import command.composite_command.CompositeCommand;
import command.composite_command.ResizeCommand;
import command.framework_that_will_use_command.*;
import command.undoable_command.BoldCommand;
import command.undoable_command.History;
import command.undoable_command.HtmlDocument;
import command.undoable_command.UndoCommand;

public class Demo {

    public static void main(String[] args) {

        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var addCustomerButton = new Button(command);
        addCustomerButton.click();


        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();


        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello");
        System.out.println(document.getContent());
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
