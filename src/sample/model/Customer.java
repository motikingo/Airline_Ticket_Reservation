package sample.model;

import sample.Conroller.*;

import java.util.ArrayList;

public class Customer {
    ArrayList<passenger> customers;

    public Customer(){
        customers = new ArrayList<passenger>();
        customers.add(new passenger("king","232"));
        customers.add(new passenger("kingo","121"));
    }


    public ArrayList<passenger> getCusomers(){
        return customers;
    }



    public passenger getCustomer(int id){
        return customers.get(id);
    }

    public void addCustomer(passenger p){
        customers.add(p);
    }

    public void deleteCustomer(int id){
        customers.remove(id);
    }


}
