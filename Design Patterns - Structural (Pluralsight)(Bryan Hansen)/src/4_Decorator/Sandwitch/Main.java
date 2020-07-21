package Sandwitch;

import Sandwitch.ComponentBase.Sandwich;
import Sandwitch.ConcreteComponent.SimpleSandwich;
import Sandwitch.ConcreteDecorator.DressingDecorator;
import Sandwitch.ConcreteDecorator.MeatDecorator;
import Sandwitch.ConcreteDecorator.SaladDecorator;

public class Main {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SaladDecorator(new SimpleSandwich())));
        System.out.println(sandwich.make());
    }
}
/*
The original object stays the same. We can use the decorator to add functionality to them.
Often is confused with inheritance.
 */