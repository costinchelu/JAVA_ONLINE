module Tim {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;
    requires javafx.base;
    requires jlfgr;
    requires java.desktop;
    requires junit;
    requires java.sql;

    opens udemy_sec13a_JavaFX.HelloWorld;
    opens udemy_sec13b_JavaFX.Layouts;
    opens udemy_sec13c_JavaFX.Controls;
    opens udemy_sec13d_JavaFX.UIApp_ver0204;
    opens udemy_sec13d_JavaFX.UIApp_ver0211;
    opens udemy_sec13e_css;
    opens udemy_sec13f_sceneBuilder;
    opens udemy_sec13g_challenge;
    opens udemy_sec13g_challenge.datamodel;
    opens udemy_sec15n_Task_JavaFX.sample;
    opens udemy_sec16b_lambdafx;
    opens udemy_sec18b_UnitTesting1;
    opens udemy_sec18c_UnitTesting2;
    opens udemy_sec18d_ParametrizedTesting;
    opens udemy_sec18e_Challenge;
    opens udemy_sec19f_MusicUI;
    opens udemy_sec19f_MusicUI.Model;
}