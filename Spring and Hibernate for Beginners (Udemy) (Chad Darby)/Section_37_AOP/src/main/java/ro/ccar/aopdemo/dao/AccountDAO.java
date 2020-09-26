package ro.ccar.aopdemo.dao;

import org.springframework.stereotype.Component;
import ro.ccar.aopdemo.dependency.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account) {
        System.out.println(getClass() + "ADDING AN ACCOUNT...");
    }

    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "ADDING AN ACCOUNT...");
    }
}
