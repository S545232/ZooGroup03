/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * This class which contains Override functions to print the First time visitor
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class FirstTimeVisitor extends Visitor {

    /**
     * Constructor with parameters to represent the behavior of a first time
     * visitor
     *
     * @param visitorCategory
     * @param ticketPrice
     * @param name
     * @param email
     * @param phoneNumber
     */
    public FirstTimeVisitor(VisitorCategory visitorCategory, String ticketPrice, String name, String email, int phoneNumber) {
        super(visitorCategory, ticketPrice, name, email, phoneNumber);
    }

    /**
     * An Override function which prints the ticket price for a first time
     * visitor
     */
    @Override
    public void ticketPrice() {
        System.out.println("Zoo Entry Ticket price for the first time visitor is : 10$");
    }

    /**
     * An Override function which prints the category of a first time visitor
     */
    @Override
    public void visitorCategory() {
        System.out.println("I am a First Time Visitor");
    }

    public static void tryCatchFile() throws Exception {
        // starting try block
        try {
            // Opening the file
            File file = new File("file.txt");

            // creating printWriter object
            // by initiating fileWriter 
            PrintWriter pw1 = new PrintWriter(new FileWriter(file), true);

            // printing sample text
            pw1.println("Hello world");
            pw1.close();

            // changing the file operation 
            // to read-only 
            file.setReadOnly();

            // trying to write to new file
            PrintWriter pw2 = new PrintWriter(new FileWriter("file.txt"), true);
            pw2.println("Hello World");

        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            System.out.println("We generally use the finally block to execute clean up code like closing connections, closing files, or freeing up threads, as it executes regardless of an exception.");
        }
    }
}
