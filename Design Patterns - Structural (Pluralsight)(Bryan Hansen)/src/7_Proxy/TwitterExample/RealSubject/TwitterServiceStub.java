package TwitterExample.RealSubject;

import TwitterExample.SubjectBase.TwitterService;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
