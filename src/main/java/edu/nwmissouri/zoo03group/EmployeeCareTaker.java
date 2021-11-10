/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This class is about Employee Care Taker
 * @author Hari Hara Mummadi
 */
public class EmployeeCareTaker extends Employee {

    /**
     * Constructor for employee care taker class
     * @param employeeID
     * @param employeeCategory
     * @param employeeName
     * @param employeeShiftTimings
     * @param name
     * @param email
     * @param phoneNumber
     */
    public EmployeeCareTaker(int employeeID, EmployeeCategory employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }
 /**
  * Over riding the method to print the employee shift timings
  */

    @Override
    public void employeeShiftTimings() {
        System.out.println("Employee shift timings are : 9AM - 5PM");
    }
/**
 * Over riding the method to print the employee name
 */
    @Override
    public void employeeName() {
        System.out.println("Employee Name : David");
    }
/**
 * Over riding the method to print the employee category
 */
    @Override
    public void employeeCategory() {
        System.out.println("I am an Care Taker in the Zoo");    }
/**
 * Over riding the method to print the employee ID
 */
    @Override
    public void employeeID() {
        System.out.println("My Employee ID is : 865432");    }
    
}
