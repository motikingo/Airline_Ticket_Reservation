package sample.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import sample.Conroller.Admin;
import sample.Conroller.Flight;
import sample.model.FlightsDatabase;

public class AddFlight {
    Stage window;
    Scene scene;

    public void addF(){
        GridPane p = new GridPane();
        p.setAlignment(Pos.CENTER);
        p.setVgap(20);
        p.setHgap(20);

        Label l = new Label("BOOK");
        GridPane.setConstraints(l,1,0);



        HBox in = new HBox(15);
        Label b1 = new Label("AirLine: ");
        TextField t1 = new TextField();
        t1.setPromptText("Air Line");
        in.getChildren().addAll(b1,t1);

        GridPane.setConstraints(in,0,1);


        Label l2 = new Label("Code: ");
        TextField t2 = new TextField();
        t2.setPromptText("Code");

        HBox in2 = new HBox(15);

        in2.getChildren().addAll(l2,t2);

        GridPane.setConstraints(in2,1,1);

        //second row

        HBox in1 = new HBox(15);
        Label b2 = new Label("Source: ");
        TextField t4 = new TextField();
        t4.setPromptText("Source");
        in1.getChildren().addAll(b2,t4);

        GridPane.setConstraints(in1,0,2);


        Label l3 = new Label("Destination");
        TextField t3 = new TextField();
        t3.setPromptText("Destination");

        HBox in3 = new HBox(15);

        in3.getChildren().addAll(l3,t3);

        GridPane.setConstraints(in3,1,2);

        //third

        HBox in4 = new HBox(15);
        Label b3 = new Label("Date: ");
//        ComboBox menu = new ComboBox();
        //menu.getItems().addAll("Economic","Business");

        TextField date = new TextField();
        date.setPromptText("Date");

        in4.getChildren().addAll(b3,date);

        GridPane.setConstraints(in4,0,3);


        Label l4 = new Label("Capacity: ");
        TextField t6 = new TextField();
        t6.setPromptText("Capacity");

        HBox in5 = new HBox(15);

        in5.getChildren().addAll(l4,t6);

        GridPane.setConstraints(in5,1,3);



        Button but = new Button("ADD");

        but.setOnAction(event -> {

            Admin.addFlight(new Flight(t1.getText(),t2.getText(),t4.getText(),t3.getText(),Integer.parseInt(t6.getText()),date.getText()));
            window.close();
        });

        GridPane.setConstraints(but,1,4);

        p.getChildren().addAll(l,in,in2,in1,in3,in4,in5,but);
        window = new Stage();
        scene = new Scene(p,800,400);
        scene.getStylesheets().add(getClass().getResource("/addFlight.css").toExternalForm());
        window.setScene(scene);
        window.show();
    }
}
