package InventoryManagement.ConcreteFlyweight;

import InventoryManagement.UnsharedFlyweight.Item;

public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}

// doesn't have a relation to the Flyweight; it's just part of the app
