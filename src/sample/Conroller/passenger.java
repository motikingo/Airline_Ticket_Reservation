package sample.Conroller;

import sample.model.FlightsDatabase;
import sample.model.TicketDatabase;

import java.util.ArrayList;
import java.util.Map;

public class passenger {
    ArrayList<Map> tickets  = new ArrayList<Map>();
    String userName,password,email,address;
    TicketDatabase ticketDatabase = new TicketDatabase();
    //FlightsDatabase flightsDatabase = new FlightsDatabase();

    public passenger(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    public void book(String userName,String password,String email,String whatClass,String address,int howManyTicket,String creditCard){
    //put in database from screen...

        for(int i =0;i<howManyTicket;i++){


            if (whatClass.equals("business")){
                tickets.add(Ticket.p);
            }
            else {
                tickets.add(Ticket.p);
            }


        }
        System.out.println("you booked: " + howManyTicket);


    }

    public ArrayList<Flight>  ViewFLights (){
        return  FlightsDatabase.getFLightDatabase().getFlights();

    }

    public void cancelTicket(int id){

        tickets.remove(id);
    }
}
