/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public abstract class Person {

    private String name;
    private String email;
    private int phoneNumber;

    public Person(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public abstract void getName();

    public abstract void getEmail();

    public abstract void getPhoneNumber();
    
    
}
