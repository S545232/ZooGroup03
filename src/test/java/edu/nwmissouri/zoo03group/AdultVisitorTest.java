/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo03group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Hari Hara Mummadi
 */
public class AdultVisitorTest {

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
     * Test of ticketPrice method, of class AdultVisitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "Zoo Entry Ticket price for the Adult Visitor is : 8.5$";
        AdultVisitor play4 = new AdultVisitor(VisitorCategory.ADULT_VISITOR, "8.5$", "Ryan Rodney Reynolds", "ryan@gmail.com", 514778899);
        play4.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of visitorCategory method, of class AdultVisitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "I am an Adult Visitor";
        AdultVisitor play3 = new AdultVisitor(VisitorCategory.ADULT_VISITOR, "8.5$", "Ryan Rodney Reynolds", "ryan@gmail.com", 514778899);
        play3.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of visitorOccupation method, of class AdultVisitor.
     */
    @Test
    public void testVisitorOccupation() {
        String expected = "Adult Visitor Occupation is : Sales Manager";
        AdultVisitor play2 = new AdultVisitor(VisitorCategory.ADULT_VISITOR, "8.5$", "Ryan Rodney Reynolds", "ryan@gmail.com", 514778899);
        play2.visitorOccupation();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

}
