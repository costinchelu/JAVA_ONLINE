package udemy_sec13d_JavaFX.UIApp_ver0204;

import udemy_sec13d_JavaFX.UIApp_ver0204.datamodel.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("To Do List");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        try {
            ToDoData.getInstance().loadToDoItems();
            //every time we initialize the app, it will load the content of the txt file
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() throws Exception {
        try {
            ToDoData.getInstance().storeTodoItems();
            // every time we close the app, it will store the data in the file
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
