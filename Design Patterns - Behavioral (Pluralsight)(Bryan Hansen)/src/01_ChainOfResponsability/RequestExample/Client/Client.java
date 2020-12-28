package Client;

import ConcreteHandlers.CEO;
import ConcreteHandlers.Director;
import ConcreteHandlers.VP;
import HandlerBase.Request;
import HandlerBase.RequestType;

public class Client {

    public static void main(String[] args) {

        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
/*
if a request cannot be approved by the directr, it will be passed to his superior in the chain of command
 */