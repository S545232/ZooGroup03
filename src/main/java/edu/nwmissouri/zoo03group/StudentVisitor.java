/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class StudentVisitor extends Visitor {
    public StudentVisitor(String visitorCategory, String ticketPrice, String name, String email, int phoneNumber, String school) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the student visitor is : 6$");
    }

    @Override
    public void visitorCategory() {
        System.out.println("I am a Student visitor");
    }
    
    public void school(){
        System.out.println("I am from School of California");
    }  
}
