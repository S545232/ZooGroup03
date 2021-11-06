/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *This class is Employee Rescue Operators
 * @author Saitej Veerabathini
 */
public class EmployeeRescueOperators extends Employee {

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
    public EmployeeRescueOperators(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    /**
     *Method to print the Insurance Provider
     */
    public void getInsuranceProvider() {
        System.out.println("Royal and Sun Alliance provides insurance for me.");
    }

    /**
     *Method to print Employee Shift Timings
     */
    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 6AM - 1PM");
    }

    /**
     *Method to print Employee Name
     */
    @Override
    public void employeeName() {
        System.out.println("Employee Name : John Greesham");
    }

    /**
     *Method to print Employee Category
     */
    @Override
    public void employeeCategory() {
        System.out.println("I'm a Rescue Operator in the Zoo");
    }

    /**
     *Method to print Employee ID
     */
    @Override
    public void employeeID() {
        System.out.println("My employee ID is : 456789");
    }

}
