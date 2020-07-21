package Sandwitch.ConcreteComponent;

import Sandwitch.ComponentBase.Sandwich;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
