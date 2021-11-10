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
 * @author S544912
 */
public class ChildVisitorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ChildVisitorTest() {
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
     * Test of ticketPrice method, of class ChildVisitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "Zoo Entry Ticket price for child visitor is : 4$";
        ChildVisitor childVisitor = new ChildVisitor(VisitorCategory.CHILD_VISITOR, "5$", "jj rodson", "rodson@gmail.com", 440675377, 4, "I need a Stroller");
        childVisitor.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of visitorCategory method, of class ChildVisitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "I am a Child visitor";
        ChildVisitor childVisitor = new ChildVisitor(VisitorCategory.CHILD_VISITOR, "5$", "jj rodson", "rodson@gmail.com", 440675377, 4, "I need a Stroller");
        childVisitor.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of age method, of class ChildVisitor.
     */
    @Test
    public void testAge() {
        String expected = "I am 4 years old";
        ChildVisitor childVisitor = new ChildVisitor(VisitorCategory.CHILD_VISITOR, "5$", "jj rodson", "rodson@gmail.com", 440675377, 4, "I need a Stroller");
        childVisitor.age();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of zooStroller method, of class ChildVisitor.
     */
    @Test
    public void testZooStroller() {
        String expected = "I need a Stroller";
        ChildVisitor childVisitor = new ChildVisitor(VisitorCategory.CHILD_VISITOR, "5$", "jj rodson", "rodson@gmail.com", 440675377, 4, "I need a Stroller");
        childVisitor.zooStroller();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
