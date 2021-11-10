/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This class which contains Override functions to print the First time visitor
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class FirstTimeVisitor extends Visitor {

    /**
     * Constructor with parameters to represent the behavior of a first time
     * visitor
     *
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     */
    public FirstTimeVisitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }


    /**
     * An Override function which prints the ticket price for a first time
     * visitor
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the first time visitor is : 10$");
    }

    /**
     * An Override function which prints the category of a first time visitor
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am a First Time Visitor");
    }

}
