/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Saitej Veerabathini
 */
public class ZooMaintainer extends Employee {

    public ZooMaintainer(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    public void getMaintenanceProvider() {
        System.out.println("SARUS company provides maintenance facility to the Zoo.");
    }

    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 9AM - 7PM");
    }

    @Override
    public void employeeName() {
        System.out.println("Employee Name : Jack Sparrow");
    }

    @Override
    public void employeeCategory() {
        System.out.println("I'm a Zoo maintainer");
    }

    @Override
    public void employeeID() {
        System.out.println("My Employee ID is: 692939");
    }
}
