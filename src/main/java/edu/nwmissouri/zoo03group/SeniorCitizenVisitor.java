/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Bhaskar Venkata Prudhvi
 */
public class SeniorCitizenVisitor extends Visitor {
    public SeniorCitizenVisitor(String SeniorCitizenVisitor, String ticketPrice, String name, String email, int phoneNumber, String zooWheelChair) {
        super(SeniorCitizenVisitor, ticketPrice, name, email, phoneNumber);
    }

    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the senior citizen visitor is : 5$");
    }

    @Override
    public void visitorCategory() {
        System.out.println("I am a Senior Citizen visitor");
    }
    
    public void age(){
        System.out.println("I am 62 years old");
    }
    
    public void zooWheelChair(){
        System.out.println("I need Wheel Chair");
    }  
}
