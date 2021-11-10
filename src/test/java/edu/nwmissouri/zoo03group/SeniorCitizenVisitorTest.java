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
 * @author S544912
 */
public class SeniorCitizenVisitorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public SeniorCitizenVisitorTest() {
    }
    
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
     * Test of ticketPrice method, of class SeniorCitizenVisitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "Zoo Entry Ticket price for the senior citizen visitor is : 5$";
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor(VisitorCategory.SENIOR_CITIZEN_VISITOR, "4$", "Cillian Murphy", "murphy@gmail.com", 62, "I need Wheel Chair");
        seniorCitizenVisitor.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of visitorCategory method, of class SeniorCitizenVisitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "I am a Senior Citizen visitor";
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor(VisitorCategory.SENIOR_CITIZEN_VISITOR, "4$", "Cillian Murphy", "murphy@gmail.com", 62, "I need Wheel Chair");
        seniorCitizenVisitor.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of age method, of class SeniorCitizenVisitor.
     */
    @Test
    public void testAge() {
        String expected = "I am 62 years old";
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor(VisitorCategory.SENIOR_CITIZEN_VISITOR, "4$", "Cillian Murphy", "murphy@gmail.com", 62, "I need Wheel Chair");
        seniorCitizenVisitor.age();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of zooWheelChair method, of class SeniorCitizenVisitor.
     */
    @Test
    public void testZooWheelChair() {
        String expected = "I need Wheel Chair";
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor(VisitorCategory.SENIOR_CITIZEN_VISITOR, "4$", "Cillian Murphy", "murphy@gmail.com", 62, "I need Wheel Chair");
        seniorCitizenVisitor.zooWheelChair();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
