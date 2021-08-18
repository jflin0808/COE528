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
public class Member extends Passenger {
    int membership;
    public Member(String name, int age, int membership){
        super(name,age);
        this.membership = membership;
    }
    @Override
    public double applyDiscount(double p){
        if(membership <= 1 )
            return p;
        else if (membership > 5)
            return p*0.5;
        else
            return p*0.9;          
    }
    
}
