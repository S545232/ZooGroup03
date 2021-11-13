/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * An abstract class which contains abstract and implemented functions 
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public abstract class AbstractPerson {

    private String name;
    private String email;
    private int phoneNumber;

    /**
     * Constructor with three parameters accepting name, email and phone number of a person
     * @param name
     * @param email
     * @param phoneNumber
     */
    public AbstractPerson(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * An abstract function to get the name
     */
    public abstract void getName();

    /**
     * An abstract function to get the email
     */
    public abstract void getEmail();

    /**
     * An abstract function to get the phone number
     */
    public abstract void getPhoneNumber();

    /**
     * This  function is to print the constructor parameters
     * @return
     */
    @Override
    public String toString() {
        return "Person{" + "Name is : " + name + ", Email is : " + email + " and PhoneNumber is : " + phoneNumber + "}";
    }   
}
