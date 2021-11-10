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
public class EmployeeRescueOperatorsTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public EmployeeRescueOperatorsTest() {
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
     * Test of getInsuranceProvider method, of class EmployeeRescueOperators.
     */
    @Test
    public void testGetInsuranceProvider() {
       String expected = "Royal and Sun Alliance provides insurance for me.";
        EmployeeRescueOperators ft = new EmployeeRescueOperators(673739, EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS, "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        ft.getInsuranceProvider();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeShiftTimings method, of class EmployeeRescueOperators.
     */
    @Test
    public void testEmployeeShiftTimings() {
        String expected = "My shift timings are : 6AM - 1PM";
        EmployeeRescueOperators ft = new EmployeeRescueOperators(673739, EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS, "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        ft.employeeShiftTimings();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeName method, of class EmployeeRescueOperators.
     */
    @Test
    public void testEmployeeName() {
        String expected = "Employee Name : John Greesham";
        EmployeeRescueOperators ft = new EmployeeRescueOperators(673739, EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS, "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        ft.employeeName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeCategory method, of class EmployeeRescueOperators.
     */
    @Test
    public void testEmployeeCategory() {
        String expected = "I'm a Rescue Operator in the Zoo";
        EmployeeRescueOperators ft = new EmployeeRescueOperators(673739, EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS, "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        ft.employeeCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of employeeID method, of class EmployeeRescueOperators.
     */
    @Test
    public void testEmployeeID() {
        String expected = "My employee ID is : 456789";
        EmployeeRescueOperators ft = new EmployeeRescueOperators(673739, EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS, "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        ft.employeeID();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }
    
}
