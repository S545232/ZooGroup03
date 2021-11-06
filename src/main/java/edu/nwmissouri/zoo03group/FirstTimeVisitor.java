/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class FirstTimeVisitor extends Visitor{

    public FirstTimeVisitor(String visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the first time visitor is : 10$");
    }

    @Override
    public void visitorCategory() {
        System.out.println("I am a First Time Visitor");
    }

}
