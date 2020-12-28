package ConcreteHandlers;

import HandlerBase.Handler;
import HandlerBase.Request;
import HandlerBase.RequestType;

import HandlerBase.Handler;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("ConcreteHandlers.CEO can approve anything they want");
    }
}
