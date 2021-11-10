/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo03group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class FirstTimeVisitorTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ticketPrice method, of class FirstTimeVisitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "Zoo Entry Ticket price for the first time visitor is : 10$";
        FirstTimeVisitor visitor = new FirstTimeVisitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of visitorCategory method, of class FirstTimeVisitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "I am a First Time Visitor";
        FirstTimeVisitor visitor = new FirstTimeVisitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
