/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * An abstract class which contains abstract and implemented functions to represent a zoo visitor
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Visitor extends AbstractPerson {

//    private String visitorCategory;
    private String ticketPrice;
    
    private VisitorCategory visitorCategory;

    /**
     * Constructor with parameters to represent the behavior of a visitor
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     */
    public Visitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(name, email, phoneNumber);
        this.visitorCategory = visitorCategory;
        this.ticketPrice = ticketPrice;
    }

    /**
     * This function prints the visitor category
     */
    public void visitorCategory() {
        System.out.println("visitorCategory printing");
    }

    /**
     * This function prints the visitor ticket price
     */
    public void ticketPrice() {
        System.out.println("ticketPrice");
    }

    /**
     * An Override function prints the name of visitor
     */
    @Override
    public void getName() {
        System.out.println("Visitor name : Saitej");
    }

    /**
     * An Override function prints the email of visitor
     */
    @Override
    public void getEmail() {
        System.out.println("Visitor email : saitej@gmail.com");
    }

    /**
     * An Override function prints the phone number of visitor
     */
    @Override
    public void getPhoneNumber() {
        System.out.println("Visitor mobile number : +1 9234567890");
    }
}
