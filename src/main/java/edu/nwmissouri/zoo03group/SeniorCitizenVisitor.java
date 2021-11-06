/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This is about Senior citizen class
 * @author Bhaskar Venkata Prudhvi
 */
public class SeniorCitizenVisitor extends Visitor {

    /**
     * Constructor for senior citizen class
     * @param SeniorCitizenVisitor
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     * @param zooWheelChair
     */
    public SeniorCitizenVisitor(String SeniorCitizenVisitor, String ticketPrice, String name, String email, int phoneNumber, String zooWheelChair) {
        super(SeniorCitizenVisitor, ticketPrice, name, email, phoneNumber);
    }

    /**
     *Override method to print Ticket Price
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the senior citizen visitor is : 5$");
    }

    /**
     *Override method to print Visitor Category
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am a Senior Citizen visitor");
    }
    
    /**
     *This method is used to print age of a Senior Citizen Visitor
     */
    public void age(){
        System.out.println("I am 62 years old");
    }
    
    /**
     *This method is used to print Zoo Wheel Chair for a Senior Citizen Visitor
     */
    public void zooWheelChair(){
        System.out.println("I need Wheel Chair");
    }  
}