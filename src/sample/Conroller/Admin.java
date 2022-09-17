package sample.Conroller;

import sample.model.Customer;
import sample.model.FlightsDatabase;
import sample.model.TicketDatabase;

import java.util.ArrayList;


public class Admin {

    //static  FlightsDatabase flightsDatabase = new FlightsDatabase();
     static Customer customer = new Customer();
    //TicketDatabase ticketDatabase = new TicketDatabase();

    //add in flight database
    public static void addFlight(Flight flight){

        FlightsDatabase.getFLightDatabase().addFlight(flight);

    }

    //delete from flight database
    public static void deleteFlight(int id){
        FlightsDatabase.getFLightDatabase().deleteFlight(id);


    }

    //update flight in flights table
    public static void updateFlight(int id){

        FlightsDatabase.getFLightDatabase().updateFlight(id);

    }



    // retieve from database
    public static ArrayList<Flight> viewFlights(){
        return FlightsDatabase.getFLightDatabase().getFlights();
    }



    //user..


    public static void addCustomer(Customer customer){


    }

    public static ArrayList<passenger> viewCustomer(){
       return customer.getCusomers();

    }

    public static void deleteCustomer(int id){
        customer.deleteCustomer(id);
    }

    //ticket







}
