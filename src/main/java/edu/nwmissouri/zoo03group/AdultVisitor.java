/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This class is about Adult Visitor which visitor
 * @author Hari Hara Mummadi
 */
public class AdultVisitor extends Visitor{

    /**
     * Constructor for Adult Visitor Class
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     */
    public AdultVisitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    /**
     * Over riding the Ticket Price For Adult visitor
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the Adult Visitor is : 8.5$");
    }

    /**
     * Over riding the Visitor Category for Adult Visitor 
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am an Adult Visitor");
    }

    /**
     * Method for Visitor Occupation of Adult Visitor
     */
    public void visitorOccupation(){
        System.out.println("Adult Visitor Occupation is : Sales Manager");
    }
}
