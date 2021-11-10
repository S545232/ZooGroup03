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
public class EmployeeTest {

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
     * Test of employeeID method, of class Employee.
     */
    @Test
    public void testEmployeeID() {
        String expected = "Employee ID";
        Employee play7 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play7.employeeID();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeCategory method, of class Employee.
     */
    @Test
    public void testEmployeeCategory() {
        String expected = "Employeecategory printing";
        Employee play6 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play6.employeeCategory();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeName method, of class Employee.
     */
    @Test
    public void testEmployeeName() {
        String expected = "Employee Name is John";
        Employee play5 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play5.employeeName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of employeeShiftTimings method, of class Employee.
     */
    @Test
    public void testEmployeeShiftTimings() {
        String expected = "Employee shift timings";
        Employee play5 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play5.employeeShiftTimings();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        String expected = "Employee name : Alex";
        Employee play5 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play5.getName();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @Test
    public void testGetEmail() {
        String expected = "Employee email : alex123@gmail.com";
        Employee play4 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play4.getEmail();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

    /**
     * Test of getPhoneNumber method, of class Employee.
     */
    @Test
    public void testGetPhoneNumber() {
        String expected = "Employee mobile number : +1 62524353738";
        Employee play3 = new Employee(865432, EmployeeCategory.EMPLOYEE_CARE_TAKER, "David", "9am-5pm", "David", "david@gmail.com", 834569972);
        play3.getPhoneNumber();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(actual, expected);
    }

}
