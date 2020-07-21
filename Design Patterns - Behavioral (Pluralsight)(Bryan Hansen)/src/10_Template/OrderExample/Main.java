package OrderExample;

import OrderExample.AlgorithmBase.OrderTemplate;
import OrderExample.ConcreteAlgorithms.StoreOrder;
import OrderExample.ConcreteAlgorithms.WebOrder;

public class Main {

    public static void main(String[] args) {

        System.out.println("Web Order:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore order:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
