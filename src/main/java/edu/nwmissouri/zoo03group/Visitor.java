/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Visitor extends Person {

    private String visitorCategory;
    private String ticketPrice;

    public Visitor(String visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(name, email, phoneNumber);
        this.visitorCategory = visitorCategory;
        this.ticketPrice = ticketPrice;
    }

    public void visitorCategory() {
        System.out.println("visitorCategory printing");
    }

    public void ticketPrice() {
        System.out.println("ticketPrice");
    }

    @Override
    public void getName() {
        System.out.println("Visitor name : Saitej");
    }

    @Override
    public void getEmail() {
        System.out.println("Visitor email : saitej@gmail.com");
    }

    @Override
    public void getPhoneNumber() {
        System.out.println("Visitor mobile number : +1 9234567890");
    }
}
