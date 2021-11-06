/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Hari Hara Mummadi
 */
public class EmployeeCareTaker extends Employee {

    public EmployeeCareTaker(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    @Override
    public void employeeShiftTimings() {
        System.out.println("Employee shift timings are : 9AM - 5PM");
    }

    @Override
    public void employeeName() {
        System.out.println("Employee Name : David");
    }

    @Override
    public void employeeCategory() {
        System.out.println("I am an Care Taker in the Zoo");    }

    @Override
    public void employeeID() {
        System.out.println("My Employee ID is : 865432");    }
    
}
