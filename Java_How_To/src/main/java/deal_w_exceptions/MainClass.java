package how_to.deal_w_exceptions;

import java.sql.SQLException;

class MainClass {

    public void foo() throws NoSuchMethodException, SQLException {
        //ANSWER:
        throw new SQLException("Exception of SQL type...");
    }

    public void foo2() {
        try {
            foo();
        } catch (NoSuchMethodException | SQLException e) {
            System.out.println("Exception was thrown:\n" + e.getMessage());
        }
    }

}
