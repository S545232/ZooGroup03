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
 * @author Saitej Veerabthini
 */
public class EmployeeGuideTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public EmployeeGuideTest() {
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
     * Test of getLanguagesKnown method, of class EmployeeGuide.
     */
    @Test
    public void testGetLanguagesKnown() {
        String expected = "I'm proficient in  English, Spanish and French languages.";
        EmployeeGuide ft = new EmployeeGuide(682939, EmployeeCategory.EMPLOYEE_GUIDE, "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        ft.getLanguagesKnown();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeShiftTimings method, of class EmployeeGuide.
     */
    @Test
    public void testEmployeeShiftTimings() {
        String expected = "My shift timings are : 10AM - 6PM";
        EmployeeGuide ft = new EmployeeGuide(682939, EmployeeCategory.EMPLOYEE_GUIDE, "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        ft.employeeShiftTimings();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeName method, of class EmployeeGuide.
     */
    @Test
    public void testEmployeeName() {
        String expected = "Employee Name : Tony Stark";
        EmployeeGuide ft = new EmployeeGuide(682939, EmployeeCategory.EMPLOYEE_GUIDE, "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        ft.employeeName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeCategory method, of class EmployeeGuide.
     */
    @Test
    public void testEmployeeCategory() {
        String expected = "I'm a Guide in the Zoo";
        EmployeeGuide ft = new EmployeeGuide(682939, EmployeeCategory.EMPLOYEE_GUIDE, "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        ft.employeeCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeID method, of class EmployeeGuide.
     */
    @Test
    public void testEmployeeID() {
        String expected = "My employee ID is: 682939";
        EmployeeGuide ft = new EmployeeGuide(682939, EmployeeCategory.EMPLOYEE_GUIDE, "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        ft.employeeID();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }
    
}
