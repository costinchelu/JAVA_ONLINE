package ConcreteHandlers;

import HandlerBase.Handler;
import HandlerBase.Request;
import HandlerBase.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
