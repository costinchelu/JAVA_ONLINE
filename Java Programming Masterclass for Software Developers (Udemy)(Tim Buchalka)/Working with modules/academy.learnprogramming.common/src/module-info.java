module academy.learnprogramming.common {
    requires java.sql;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens academy.learnprogramming.common to javafx.base;

    exports academy.learnprogramming.common;
}