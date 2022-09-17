package sample.View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogIn {


    public static void logInForm(){
        Stage window;
        Scene scene;
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(15);
        pane.setVgap(15);

        Label username = new Label("UserName: ");
        GridPane.setConstraints(username,0,0);
        TextField useField = new TextField();
        useField.setPromptText("user Name");
        GridPane.setConstraints(useField,1,0);

        Label password = new Label("UserName: ");
        GridPane.setConstraints(password,0,1);
        TextField passwordField = new TextField();
        useField.setPromptText("user Name");
        GridPane.setConstraints(passwordField,1,1);

        Button b = new Button("LogIn");

        b.setOnAction(event -> {

        });





    }
}
