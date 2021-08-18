/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Jia fei Lin
 */
public class Flight {
    int flightNumber, capacity, numberOfSeatsLeft;
    String origin, destination, departureTime;
    double originalPrice;
    public Flight(int capacity, int flightNumber, String origin, String destination, String departureTime, double originalPrice){
        if(origin.equals(destination))
            throw new IllegalArgumentException("Origin cannot equal Destination");
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft = capacity;
    }
    public boolean bookASeat(){
        if(numberOfSeatsLeft >0){
            numberOfSeatsLeft = numberOfSeatsLeft -1;
            return true;
        }
        else
            return false;
    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDestination(){
        return destination;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public double getOriginalPrice(){
        return originalPrice;
    }
     public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", "+ origin + " to " + destination + ", " 
                + departureTime + ", " + "original price: $" + originalPrice;
    }
}
