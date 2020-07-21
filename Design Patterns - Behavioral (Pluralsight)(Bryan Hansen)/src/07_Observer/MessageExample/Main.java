package MessageExample;

import MessageExample.ConcreteObserver.PhoneClient;
import MessageExample.ConcreteObserver.TabletClient;
import MessageExample.ConcreteSubject.MessageStream;
import MessageExample.SubjectBase.Subject;

public class Main {

    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tableClient = new TabletClient(subject);

        phoneClient.addMessage("Hello!");
        tableClient.addMessage("How are you?");
    }
}
