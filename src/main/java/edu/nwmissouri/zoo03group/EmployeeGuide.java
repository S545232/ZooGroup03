/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *This class is Employee Guide
 * @author Saitej Veerabathini
 */
public class EmployeeGuide extends Employee {

    /**
     *This is a constructor for this class
     * @param employeeID
     * @param employeeCategory
     * @param employeeName
     * @param employeeShiftTimings
     * @param name
     * @param email
     * @param phoneNumber
     */
    public EmployeeGuide(int employeeID, EmployeeCategory employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    /**
     *Method to print the languages known
     */
    public void getLanguagesKnown() {
        System.out.println("I'm proficient in  English, Spanish and French languages.");
    }

    /**
     *Method to print Employee Shift timings
     */
    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 10AM - 6PM");
    }

    /**
     *Method to print Employee Name
     */
    @Override
    public void employeeName() {
        System.out.println("Employee Name : Tony Stark");
    }

    /**
     *Method to print Employee Category
     */
    @Override
    public void employeeCategory() {
        System.out.println("I'm a Guide in the Zoo");
    }

    /**
     *Method to print Employee ID
     */
    @Override
    public void employeeID() {
        System.out.println("My employee ID is: 682939");
    }

}
