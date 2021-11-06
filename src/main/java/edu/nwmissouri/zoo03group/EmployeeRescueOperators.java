/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Saitej Veerabathini
 */
public class EmployeeRescueOperators extends Employee {

    public EmployeeRescueOperators(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    public void getInsuranceProvider() {
        System.out.println("Royal and Sun Alliance provides insurance for me.");
    }

    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 6AM - 1PM");
    }

    @Override
    public void employeeName() {
        System.out.println("Employee Name : John Greesham");
    }

    @Override
    public void employeeCategory() {
        System.out.println("I'm a Rescue Operator in the Zoo");
    }

    @Override
    public void employeeID() {
        System.out.println("My employee ID is : 456789");
    }

}
