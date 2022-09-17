package sample.model;

import sample.Conroller.Flight;

import java.util.ArrayList;

public class FlightsDatabase {

    ArrayList<Flight> flights = new ArrayList<Flight>();
    static FlightsDatabase flightsDatabase = new FlightsDatabase();

//    public FlightsDatabase(){
////        flights.add(new Flight("finfine","09A30","dire dawa","naqamte",200,"today"));
////        flights.add( new Flight("LA","boing337","DC","California",200,"Tomorrow"));
//    }

    public static FlightsDatabase getFLightDatabase(){
        return flightsDatabase;
    }


    public ArrayList<Flight> getFlights(){
        return flights;
    }


    public Flight getFlight(int id){
        return flights.get(id);
    }

    public void addFlight(Flight p){
        flights.add(p);
    }

    public void deleteFlight(int id){
        flights.remove(id);
    }

    public  void updateFlight(int id){


    }

}
