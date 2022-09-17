package sample.Conroller;

public class Flight {
    String airLine, start,destination,date_of_flight,code;
    int id,capacity,ecoPrice,bisPrice;
    Ticket[] numTicket = new Ticket[capacity];



    public Flight(String airLine,String code,String start,String destination,int capacity,String date_of_flight){
        this.airLine = airLine;
        this.start = start;
        this.destination = destination;
        this.capacity = capacity;
        this.date_of_flight = date_of_flight;
        this.code = code;
    }

    public String getAirLine() {
        return airLine;
    }

    public int getBisPrice() {
        return bisPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEcoPrice() {
        return ecoPrice;
    }

    public int getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    public Ticket[] getNumTicket() {
        return numTicket;
    }

    public String getDate_of_flight() {
        return date_of_flight;
    }

    //classes classes; //economical VS business

    public int leftNumOfSeat(){return 0;}


}
