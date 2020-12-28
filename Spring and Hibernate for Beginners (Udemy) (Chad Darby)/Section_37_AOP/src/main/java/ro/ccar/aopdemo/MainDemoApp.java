package ro.ccar.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ccar.aopdemo.dao.AccountDAO;
import ro.ccar.aopdemo.dao.OperationsDAO;
import ro.ccar.aopdemo.dao.MembershipDAO;
import ro.ccar.aopdemo.dependency.Account;

public class MainDemoApp {

    public static void main(String[] args) {

        // read Spring config Java Class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);


        // getting bean from Spring container
        OperationsDAO operationsD = context.getBean("operationsDAO", OperationsDAO.class);
        MembershipDAO membershipD = context.getBean("membershipDAO", MembershipDAO.class);
        AccountDAO accountD = context.getBean("accountDAO", AccountDAO.class);

        Account account = new Account();

        // call the business methods
        operationsD.addOp();
        membershipD.addAccount();
        operationsD.updateOp("Some parameter");
        accountD.addAccount(account);
        accountD.addAccount(account, true);
        membershipD.goToSleep();

        // close the context
        context.close();
    }
}
