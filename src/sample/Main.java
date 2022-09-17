package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.View.AdminHome;
import sample.View.CustomerHome;
import sample.model.TicketDatabase;

public class Main extends Application {
    Scene scene;

    Button button1,button2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox v = new VBox(30);
        v.setAlignment(Pos.CENTER);

        Label vd = new Label("FLIGHT TICKET");

        vd.setStyle(" -fx-font-size: 20px; -fx-text-fill: a9a9a9;  -fx-font-family: Arial ;   -fx-fill: #818181;  -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 ); ");

        HBox box = new HBox(10);
        box.setAlignment(Pos.CENTER);

        button1 = new Button("AS ADMIN");

        button1.setOnAction(event -> {
            AdminHome adminHome = new AdminHome();

            adminHome.flighsView();

        });

        button2 = new Button("AS USER");


            button2.setOnAction(event -> {
                TicketDatabase.l.clear();
                //CustomerHome.flightListView
                CustomerHome b = new CustomerHome();
                b.page(0);

                //b.flightListView.getItems().remove(0);

            });





        Label lb = new Label("OR");
        lb.setStyle("-fx-text-fill: linear-gradient(white, #d0d0d0);");

        box.getChildren().addAll(button1,lb,button2);

        v.getChildren().addAll(vd,box);

        scene = new Scene(v,600,400);

        scene.getStylesheets().add(getClass().getResource("/mainStyle.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void acd(boolean c){
        c = !c;
    }

    public static void main(String[] args) {

        launch(args);
    }
}
