package sample.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Conroller.Flight;
import sample.model.FlightsDatabase;
import sample.model.TicketDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerHome {

    public static ListView<HBox> flightListView = new ListView<HBox>();
    //ArrayList<> arrayList = new ArrayList<>();


      static ArrayList<Integer> tik_num = new ArrayList<Integer>();

    public  void page (int damm){

        //passenger psg = new passenger();


        Stage window = new Stage();


        Scene scene1;

        // FlightsDatabase ds = new FlightsDatabase();


        // MenuBar menuBar = new MenuBar();
        Button b1,b2;

        for (int i = damm;i<FlightsDatabase.getFLightDatabase().getFlights().size();i++){
            System.out.println(damm);
            Flight f = FlightsDatabase.getFLightDatabase().getFlights().get(i);
            HashMap<String,String> map = new HashMap<String,String>();
            map.put("source",f.getStart());
            map.put("destination",f.getDestination());
            TicketDatabase.l.add(map);


            //         HBox b = new HBox(20);
//            Label l1 = new Label(f.getDestination());
//            Label l2 = new Label(f.getDate_of_flight());
//            Button button = new Button("BOOK");

//            button.setOnAction(event -> {
//                flightListView.getItems().remove(a);
//                BookForm form = new BookForm(f.getAirLine(),f.getStart(),f.getDestination(),f.leftNumOfSeat());
//                form.book();
//
//                window.close();
//            });
//
//            HBox bb = new HBox(250);
//            HBox d = new HBox(80);
//            Label l12 = new Label(tik_num+" BOOKED");
//
//            l12.setStyle("-fx-font-size: 15px;   -fx-background-radius: 5,4,3,5; -fx-text-fill: a9a9a9;  -fx-font-family: Arial ;  -fx-background-color : #2f2f2f;   -fx-fill: #818181;  -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 );");
//
//            l12.setPadding(new Insets(10));
//            b.getChildren().addAll(l1,l2);
//            d.getChildren().addAll(button,l12);
//            bb.getChildren().addAll(b,d);
//
//            flightListView.getItems().add(bb);

        }

        for (int i = damm; i <TicketDatabase.l.size() ; i++) {
            System.out.println(damm);
            tik_num.add(0);
            final int tempo = i;
            HBox b = new HBox(20);
            Label l1 = new Label(TicketDatabase.l.get(i).get("source"));
            Label l2 = new Label(TicketDatabase.l.get(i).get("destination"));
            Button button = new Button("BOOK");

            button.setOnAction(event -> {
//                flightListView.getItems().remove(a);
                BookForm form = new BookForm();
                form.book(tempo);

                 window.close();
            });

            HBox bb = new HBox(250);
            HBox d = new HBox(80);
            Label l12 = new Label(tik_num.get(i)+" BOOKED");

            l12.setStyle("-fx-font-size: 15px;   -fx-background-radius: 5,4,3,5; -fx-text-fill: a9a9a9;  -fx-font-family: Arial ;  -fx-background-color : #2f2f2f;   -fx-fill: #818181;  -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 );");

            l12.setPadding(new Insets(10));
            b.getChildren().addAll(l1,l2);
            d.getChildren().addAll(button,l12);
            bb.getChildren().addAll(b,d);

            flightListView.getItems().add(bb);



        }
        //TicketDatabase.l.clear();


        VBox s = new VBox();


        b1 = new Button("BOOK");
        b1.setOnAction(event -> {
            //BookForm.book();

        });

         //l = new ListView<Map>();
        b2 = new Button("Booked");

//        b2.setOnAction(event -> {
//
//            s.getChildren().add(l);
//        });

        Button b= new Button("Log out");
        b.setOnAction(event -> {
            window.close();
        });


        HBox h1= new HBox();
        h1.getChildren().addAll(b1,b2);

        HBox h2 = new HBox(350);
        h2.getChildren().addAll(h1,b);


       s.getChildren().addAll(h2,flightListView);

//        VBox layout = new VBox();
//        layout.getChildren().addAll(h1,flightListView);


        scene1 = new Scene(s,600,400);


        scene1.getStylesheets().add(getClass().getResource("/customerHome.css").toExternalForm());

        window.setScene(scene1);
        window.show();



    }

}
