/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Hari Hara Mummadi
 */
public class AdultVisitor extends Visitor{

    public AdultVisitor(String visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }
    @Override
    public void ticketPrice() {
        System.out.println("Ticket price for the Adult time visitor is : 8.5$");
    }

    @Override
    public void visitorCategory() {
        System.out.println("I am an Adult Visitor");
    }
    
}
