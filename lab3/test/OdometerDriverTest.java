/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import lab3.Odometer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jiafei Lin
 */
public class OdometerDriverTest {

    public static void main(String[] args){
        try{
            //read number of digits for o from console
            System.out.print("Enter number of digits for o: ");
            Scanner s = new Scanner( System.in);
            int numOfDigits = s.nextInt();
            
            Odometer o = new Odometer(numOfDigits);
            //Increment 130 times and print the Count.
            
            for ( int i = 0; i < 130; ++i ) {
                o.Increment();
            }  
            System.out.println(o.Count());
            
            //Decrement 31 times and print the Count.
            for ( int i = 0; i < 31; ++i ){
                o.Decrement();
            }
            System.out.println(o.Count());
            
            //Increment 1001 times and print the Count.
            for ( int i = 0; i < 1001; ++i ){
                o.Increment();
            }
            System.out.println(o.Count());
            
            // Decrement 1101 times and print the Count.
            for ( int i = 0; i < 1101; ++i ){
                o.Decrement();
            } 
            System.out.println(o.Count());
            
            //Reset the o and print the Count.
            o.Reset();
            System.out.println(o.Count());
            //Decrement once and print the Count.
            o.Decrement();
            System.out.println(o.Count());
            //Increment once and print the Count.
            o.Increment();
            System.out.println(o.Count());
        }
        catch(IllegalArgumentException ex){
            System.out.println("Must have at least 1 digit");
        }
    }
}