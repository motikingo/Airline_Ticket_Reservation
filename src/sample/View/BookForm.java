package sample.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.Conroller.Ticket;
import sample.model.FlightsDatabase;
import sample.model.TicketDatabase;
import sun.util.resources.cldr.chr.TimeZoneNames_chr;

public class BookForm {

    String ariLine,start,destination;
    int tik_num;
    Ticket tk = new Ticket();

//    public BookForm(){
//        this.ariLine = airLine;
//        this.start = start;
//        this.destination = destination;
//        this.tik_num = tik_num;
//    }

    public void book(int i){


        Stage window = new Stage();;
        Scene scene;
//
//        VBox container = new VBox();

//
//        HBox box1 = new HBox(50);
        GridPane p = new GridPane();
        p.setAlignment(Pos.CENTER);
        p.setVgap(20);
        p.setHgap(20);

        Label l = new Label("BOOK");
        GridPane.setConstraints(l,1,0);



        HBox in = new HBox(15);
        Label b1 = new Label("USER NAME: ");
        TextField t1 = new TextField();
        t1.setPromptText("UserName");
        in.getChildren().addAll(b1,t1);

        GridPane.setConstraints(in,0,1);


        Label l2 = new Label("PASSWORD: ");
        TextField t2 = new TextField();
        t2.setPromptText("password");

        HBox in2 = new HBox(15);

        in2.getChildren().addAll(l2,t2);

        GridPane.setConstraints(in2,1,1);

        //second row

        HBox in1 = new HBox(15);
        Label b2 = new Label("Email: ");
        TextField t4 = new TextField();
        t4.setPromptText("Email");
        in1.getChildren().addAll(b2,t4);

        GridPane.setConstraints(in1,0,2);


        Label l3 = new Label("Address");
        TextField t3 = new TextField();
        t3.setPromptText("Address");

        HBox in3 = new HBox(15);

        in3.getChildren().addAll(l3,t3);

        GridPane.setConstraints(in3,1,2);

        //third

        HBox in4 = new HBox(15);
        Label b3 = new Label("Class: ");
        ComboBox menu = new ComboBox();
        menu.getItems().addAll("Economic","Business");

        in4.getChildren().addAll(b3,menu);

        GridPane.setConstraints(in4,0,3);


        Label l4 = new Label("How Many: ");
        TextField t6 = new TextField();
        t6.setPromptText("tickets");

        HBox in5 = new HBox(15);

        in5.getChildren().addAll(l4,t6);

        GridPane.setConstraints(in5,1,3);

        Button button = new Button("Book");

        button.setOnAction(event -> {

            CustomerHome hm =  new CustomerHome();
            TicketDatabase.l.remove(i);
            CustomerHome.flightListView.getItems().remove(i);
            CustomerHome.tik_num.set(i,Integer.parseInt(tk.ticket_no(Integer.parseInt(t6.getText())).display().get("Ticket_no").toString()));



           // System.out.println(TicketDatabase.l.size());
            //hm.tik_num = Integer.parseInt(t6.getText());
            TicketDatabase.l.clear();
           // CustomerHome.flightListView.getItems().removeAll();
            hm.page(FlightsDatabase.getFLightDatabase().getFlights().size()-1);

//            for(int j = 0;j> FlightsDatabase.getFLightDatabase().getFlights().size();j++){
//                hm.flightListView.getItems().remove(0);
//            }



            if(i-1>=0){

                //hm.flightListView.getItems().remove(0);
            }
            window.close();
        });

        GridPane.setConstraints(button,1,4);

        p.getChildren().addAll(l,in,in2,in1,in3,in4,in5,button);

        scene = new Scene(p,800,400);
        scene.getStylesheets().add(getClass().getResource("/bookForm.css").toExternalForm());

        window.setScene(scene);
        window.show();

    }

}
