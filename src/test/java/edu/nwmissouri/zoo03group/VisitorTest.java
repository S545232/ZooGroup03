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
public class VisitorTest {

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
     * Test of visitorCategory method, of class Visitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "visitorCategory printing";
        Visitor visitor = new Visitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of ticketPrice method, of class Visitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "ticketPrice";
        Visitor visitor = new Visitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of getName method, of class Visitor.
     */
    @Test
    public void testGetName() {
        String expected = "Visitor name : Saitej";
        Visitor visitor = new Visitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.getName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of getEmail method, of class Visitor.
     */
    @Test
    public void testGetEmail() {
        String expected = "Visitor email : saitej@gmail.com";
        Visitor visitor = new Visitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.getEmail();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of getPhoneNumber method, of class Visitor.
     */
    @Test
    public void testGetPhoneNumber() {
        String expected = "Visitor mobile number : +1 9234567890";
        Visitor visitor = new Visitor(VisitorCategory.FIRST_TIME_VISITOR, "10$", "James Cameron", "james@live.com", 989578575);
        visitor.getPhoneNumber();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
