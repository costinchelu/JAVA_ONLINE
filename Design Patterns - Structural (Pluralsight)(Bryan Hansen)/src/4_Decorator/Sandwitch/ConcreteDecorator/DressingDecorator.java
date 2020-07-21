package Sandwitch.ConcreteDecorator;

import Sandwitch.ComponentBase.Sandwich;
import Sandwitch.DecoratorBase.SandwichDecorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + dressing";
    }
}
