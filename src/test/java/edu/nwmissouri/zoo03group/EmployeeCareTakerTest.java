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
public class EmployeeCareTakerTest {

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
     * Test of employeeShiftTimings method, of class EmployeeCareTaker.
     */
    @Test
    public void testEmployeeShiftTimings() {
        String expected = "Employee shift timings are : 9AM - 5PM";
        EmployeeCareTaker play1 = new EmployeeCareTaker(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play1.employeeShiftTimings();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeName method, of class EmployeeCareTaker.
     */
    @Test
    public void testEmployeeName() {
        String expected = "Employee Name : David";
        EmployeeCareTaker play2 = new EmployeeCareTaker(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play2.employeeName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeCategory method, of class EmployeeCareTaker.
     */
    @Test
    public void testEmployeeCategory() {
        String expected = "I am an Care Taker in the Zoo";
        EmployeeCareTaker play3 = new EmployeeCareTaker(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play3.employeeCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeID method, of class EmployeeCareTaker.
     */
    @Test
    public void testEmployeeID() {
        String expected = "My Employee ID is : 865432";
        EmployeeCareTaker play4 = new EmployeeCareTaker(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play4.employeeID();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

}
