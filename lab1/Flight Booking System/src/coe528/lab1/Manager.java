/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;
import java.util.ArrayList;
/**
 *
 * @author Jia fei Lin
 */
public class Manager {
    Flight[] flights = new Flight[5];
    ArrayList<Ticket> tickets = new ArrayList<>();
    
    public void createFlights(){
        flights[0] = new Flight(30, 1,"Toronto","Kimchi Town","03/05/15 6:30am", 888.88);
        flights[1] = new Flight(15, 2,"Toronto","Vatican City","03/05/16 7:30am", 77.77);
        flights[2] = new Flight(0, 3,"Toronto","Cabbage Land","03/05/17 8:30am", 555.55);
        flights[3] = new Flight(30, 4,"Toronto","Atlantis","03/05/18 9:30am", 4444.44);
        flights[4] = new Flight(15, 5,"Toronto","Tokyo","03/05/19 10:30am", 999.99);
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for(int i =0; i < flights.length;i++){
            if(flights[i].origin.equals(origin) && flights[i].destination.equals(destination)){
                if(flights[i].bookASeat())
                    System.out.println(flights[i]);
                else
                    System.out.println("Sorry there are no more available seats");
            }
        }
    }
    
    public Flight getFlight(int flightNumber){
        Flight f = null;
        for(int i =0; i<flights.length;i++){
            if(flights[i].getFlightNumber() == flightNumber)
                f = flights[i];
        }
        return f;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
        Flight f = getFlight(flightNumber);
        if(f != null){
            if(f.bookASeat()){
                tickets.add(new Ticket(p,f,p.applyDiscount(f.getOriginalPrice())));
            }
            else
                tickets.add(null);
        }
    }
    
    public static void main (String args[]){
        Manager m = new Manager();
        m.createFlights();
       
        m.bookSeat(1,new NonMember("Annie", 20));
        m.bookSeat(2,new Member("George", 69, 10));
        m.bookSeat(3,new Member("Alex", 12, 0));
        m.bookSeat(4,new Member("Jason", 30, 3));
       
        System.out.println("Showcasing the displayAvailableFlights method, testing both conditions");
        m.displayAvailableFlights("Toronto", "Kimchi Town");
        m.displayAvailableFlights("Toronto", "Cabbage Land");
       
        System.out.println("Showcasing the flight and pricing for Annie when"
                + " she is a non member and not a senior: " + "\n" + m.tickets.get(0));
        
        System.out.println("Showcasing the flight and pricing for George "
                + "who is a long time member as well as a senior: " + "\n" + m.tickets.get(1));
        
        System.out.println("Showcasing what occurs when there are no available seats left"
                + " for Alex's flight to Vatican City: " + "\n" + m.tickets.get(2));
        
        System.out.println("Showcasing the flight and pricing for Jason "
                + "who is a junior member and not a senior: " + "\n" + m.tickets.get(3));
    }
}
