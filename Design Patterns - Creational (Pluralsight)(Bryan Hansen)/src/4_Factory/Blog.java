import DifferentPages.AboutPage;
import DifferentPages.CommentPage;
import DifferentPages.ContactsPage;
import DifferentPages.PostPage;

public class Blog extends Website {

    // the createWebsite method is implemeted from parent abstract class and
    // it will be called exactly when we are creating a Website type object
    // that means whenever we are creating a Blog() we will call createWebsite adding pages to the pages list
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactsPage());
    }
}
