module academy.learnprogramming.ui {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires academy.learnprogramming.db;

    opens academy.learnprogramming.ui to javafx.fxml;

    exports academy.learnprogramming.ui to javafx.graphics;
}