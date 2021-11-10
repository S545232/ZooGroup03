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
 * @author Saitej Veerabathini
 */
public class ZooMaintainerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ZooMaintainerTest() {
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
     * Test of getMaintenanceProvider method, of class ZooMaintainer.
     */
    @Test
    public void testGetMaintenanceProvider() {
        String expected = "SARUS company provides maintenance facility to the Zoo.";
        ZooMaintainer ft = new ZooMaintainer(692939, EmployeeCategory.ZOO_MAINTAINER, "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        ft.getMaintenanceProvider();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeShiftTimings method, of class ZooMaintainer.
     */
    @Test
    public void testEmployeeShiftTimings() {
        String expected = "My shift timings are : 9AM - 7PM";
        ZooMaintainer ft = new ZooMaintainer(692939, EmployeeCategory.ZOO_MAINTAINER, "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        ft.employeeShiftTimings();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeName method, of class ZooMaintainer.
     */
    @Test
    public void testEmployeeName() {
        String expected = "Employee Name : Jack Sparrow";
        ZooMaintainer ft = new ZooMaintainer(692939, EmployeeCategory.ZOO_MAINTAINER, "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        ft.employeeName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeCategory method, of class ZooMaintainer.
     */
    @Test
    public void testEmployeeCategory() {
        String expected = "I'm a Zoo maintainer";
        ZooMaintainer ft = new ZooMaintainer(692939, EmployeeCategory.ZOO_MAINTAINER, "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        ft.employeeCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeID method, of class ZooMaintainer.
     */
    @Test
    public void testEmployeeID() {
        String expected = "My Employee ID is: 692939";
        ZooMaintainer ft = new ZooMaintainer(692939, EmployeeCategory.ZOO_MAINTAINER, "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        ft.employeeID();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }
    
}
