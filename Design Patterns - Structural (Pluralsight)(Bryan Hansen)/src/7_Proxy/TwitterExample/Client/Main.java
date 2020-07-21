package TwitterExample.Client;

import TwitterExample.Proxy.SecurityProxy;
import TwitterExample.SubjectBase.TwitterService;
import TwitterExample.RealSubject.TwitterServiceStub;

public class Main {

    public static void main(String[] args) {

        //TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("bh5k"));


    }
}
/*
- acts as an interface by wrapping
- can add functionality
- proxy is called to access real object
- we only get to use one instance
- utilities built into Java API

java.lang.reflect.Proxy
java.rmi.*
 */