/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Saitej Veerabathini
 */
public class EmployeeGuide extends Employee {

    public EmployeeGuide(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    public void getLanguagesKnown() {
        System.out.println("I know English, Hindi and Telugu.");
    }

    @Override
    public void employeeShiftTimings() {
        System.out.println("Employee Shift Timings are : 10AM - 6PM");
    }

    @Override
    public void employeeName() {
        System.out.println("Employee Name : Tony Stark");
    }

    @Override
    public void employeeCategory() {
        System.out.println("I'm an Employee Guide in a Zoo");
    }

    @Override
    public void employeeID() {
        System.out.println("My Employee ID is: 682939");
    }

}
