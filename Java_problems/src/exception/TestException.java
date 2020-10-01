package exception;

import java.sql.SQLException;

public class TestException {

    public static void main(String[] args) throws NoSuchMethodException, SQLException {

        MainClass m = new MainClass();
        m.foo2();
    }
}
