package MessageExample.ObserverBase;

import MessageExample.SubjectBase.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
