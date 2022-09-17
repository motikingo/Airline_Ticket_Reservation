package sample.Conroller;

import java.util.HashMap;
import java.util.Map;

public class Ticket {
    String source,destination,airLine,date;
    int ticket_no,seat_no,price;
    static HashMap p = new HashMap();


//    this.airLine = airLine;
//        this.date =date;
//        this.destination = destination;
//        this.ticket_no = ticket_no;
//        this.source = source;
//        this.price = price;
//        this.seat_no = seat_no;


    public  Ticket Classes(String cl){

        p.put("class",cl);
        return this;
    }


    public Ticket fromTO(String source,String destination){

        p.put("source",source);
        p.put("destination",destination);
        return this;
    }


    public  Ticket ticket_no(int t_num){
        p.put("Ticket_no",t_num);
        return this;
    }

    public   Ticket airLine(String airLine){
        p.put("AirLine",airLine);
        return this;
    }

    public  Ticket price(int price){

        p.put("price",price);
        return this;
    }

    public HashMap display(){
        return p;
    }
}

