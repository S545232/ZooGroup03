/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class ChildVisitor extends Visitor{
    public ChildVisitor(String visitorCategory, String ticketPrice, String name, String email, int phoneNumber, int age, String zooStroller) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    @Override
    public void ticketPrice() {
        System.out.println("Ticket price for the child visitor is : 4$");
    }

    @Override
    public void visitorCategory() {
        System.out.println("I am a Child visitor");
    }
    
    public void age(){
        System.out.println("My age is 4 Years");
    }
        
    
    public void zooStroller(){
        System.out.println("I need  a Stroller");
    }  
    
}
