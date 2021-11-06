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
        System.out.println("I'm proficient in  English, Spanish and French languages.");
    }

    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 10AM - 6PM");
    }

    @Override
    public void employeeName() {
        System.out.println("Employee Name : Tony Stark");
    }

    @Override
    public void employeeCategory() {
        System.out.println("I'm a Guide in the Zoo");
    }

    @Override
    public void employeeID() {
        System.out.println("My employee ID is: 682939");
    }

}
