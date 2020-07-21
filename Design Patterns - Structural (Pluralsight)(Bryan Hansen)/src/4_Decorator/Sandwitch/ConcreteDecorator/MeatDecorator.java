package Sandwitch.ConcreteDecorator;

import Sandwitch.ComponentBase.Sandwich;
import Sandwitch.DecoratorBase.SandwichDecorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + meat";
    }
}
