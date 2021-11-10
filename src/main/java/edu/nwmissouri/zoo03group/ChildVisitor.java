/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This is about Child visitor class
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class ChildVisitor extends Visitor{

    /**
     * constructor in the class
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     * @param age
     * @param zooStroller
     */
    public ChildVisitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber, int age, String zooStroller) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    /**
     *Override method to print Ticket Price
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for child visitor is : 4$");
    }

    /**
     *Override method to print Visitor Category
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am a Child visitor");
    }
    
    /**
     *This method is used to print age of a Child Visitor
     */
    public void age(){
        System.out.println("I am 4 years old");
    }
        
    /**
     *This method is used to print Zoo Stroller for a Child Visitor
     */
    public void zooStroller(){
        System.out.println("I need a Stroller");
    }  
    
}
