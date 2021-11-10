/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This is about Student visitor class
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class StudentVisitor extends Visitor {

    /**
     * Constructor for Student visitor class
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     * @param school
     */
    public StudentVisitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber, String school) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    /**
     *Override method to print Ticket Price
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the student visitor is : 6$");
    }

    /**
     *Override method to print Visitor Category
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am a Student visitor");
    }
    
    /**
     *This method is used to print School of a Student Visitor
     */
    public void school(){
        System.out.println("I am from School of California");
    }  
}