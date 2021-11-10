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
public class StudentVisitorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public StudentVisitorTest() {
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
     * Test of ticketPrice method, of class StudentVisitor.
     */
    @Test
    public void testTicketPrice() {
        String expected = "Zoo Entry Ticket price for the student visitor is : 6$";
        StudentVisitor studentVisitor = new StudentVisitor(VisitorCategory.STUDENT_VISITOR, "6$", "Christopher Nolan", "nolan@gmail.com", 660987542, "School of California");
        studentVisitor.ticketPrice();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of visitorCategory method, of class StudentVisitor.
     */
    @Test
    public void testVisitorCategory() {
        String expected = "I am a Student visitor";
        StudentVisitor studentVisitor = new StudentVisitor(VisitorCategory.STUDENT_VISITOR, "6$", "Christopher Nolan", "nolan@gmail.com", 660987542, "School of California");
        studentVisitor.visitorCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of school method, of class StudentVisitor.
     */
    @Test
    public void testSchool() {
        String expected = "I am from School of California";
        StudentVisitor studentVisitor = new StudentVisitor(VisitorCategory.STUDENT_VISITOR, "6$", "Christopher Nolan", "nolan@gmail.com", 660987542, "School of California");
        studentVisitor.school();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
