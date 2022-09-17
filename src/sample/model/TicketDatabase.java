package sample.model;

import sample.Conroller.Ticket;

import java.util.ArrayList;
import java.util.Map;

public class TicketDatabase {

    ArrayList<Ticket> tickets;
    ArrayList<Integer> howMany = new ArrayList<Integer>();
    public static ArrayList<Map<String,String>> l = new ArrayList<Map<String,String>>();

    public ArrayList<Ticket> getTickets(){
        return tickets;
    }


    public Ticket getTicket(int id){
        return tickets.get(id);
    }

    public void addTicket(Ticket p){
        tickets.add(p);
    }

    public void deleteTicket(int id){
        tickets.remove(id);
    }

}
