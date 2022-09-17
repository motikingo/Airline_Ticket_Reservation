package sample.View;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Conroller.Admin;
import sample.Conroller.Flight;
import sample.model.FlightsDatabase;
import sample.model.TicketDatabase;

import javax.swing.*;
import java.awt.*;


public class AdminHome {



   public void flighsView(){

       //Admin admin = new Admin();

       Stage window = new Stage();;


       Scene scene1;

       ListView<HBox> flightListView = new ListView<HBox>();

      // MenuBar menuBar = new MenuBar();
       Button b1,b2;
       boolean control = true;

      b1 = new Button("flight");


       b1.setOnAction(event -> {
           int j =  flightListView.getItems().size();

           for (int i = j;i<Admin.viewFlights().size();i++){
               final  int d = i;

               HBox box = new HBox(30);

               Label ll1 = new Label(Admin.viewFlights().get(i).getStart());
               Label ll = new Label(Admin.viewFlights().get(i).getDestination());
               Button bb1 = new Button("Cancle Flight");

               bb1.setOnAction(event1 -> {
                   System.out.println(d);
                   //TicketDatabase.l.remove(d);
                    CustomerHome.flightListView.getItems().remove(d);
                   flightListView.getItems().remove( d);
                   FlightsDatabase.getFLightDatabase().deleteFlight(d);
               });

               HBox v = new HBox(200);
               box.getChildren().addAll(ll1,ll);

               v.getChildren().addAll(box,bb1);

               flightListView.getItems().add(v);

           }

           //flightListView.getItems().addAll(Admin.viewFlights());




       });


      b2 = new Button("User");


      b2.setOnAction(event -> {

      });

       Button add = new Button("Add Fl");

       add.setOnAction(event -> {
           AddFlight ad = new AddFlight();
           ad.addF();
       });

       Button b= new Button("Log out");
       b.setOnAction(event -> {
           window.close();
       });

       HBox h2 = new HBox(300);
       HBox h1= new HBox();

       h1.getChildren().addAll(b1,b2,add);
       h2.getChildren().addAll(h1,b);

       Label a = new Label("blabla");

       VBox layout = new VBox();
       layout.getChildren().addAll(h2,flightListView);


       scene1 = new Scene(layout,600,400);

        scene1.getStylesheets().add(getClass().getResource("/adminHome.css").toExternalForm());

       window.setScene(scene1);
       window.show();



   }


}
