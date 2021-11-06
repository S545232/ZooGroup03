/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *This class is Zoo Maintainer
 * @author Saitej Veerabathini
 */
public class ZooMaintainer extends Employee {

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
    public ZooMaintainer(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    /**
     *Method to print Maintenance Provider
     */
    public void getMaintenanceProvider() {
        System.out.println("SARUS company provides maintenance facility to the Zoo.");
    }

    /**
     *Method to print Employee Shift Timings
     */
    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 9AM - 7PM");
    }

    /**
     *Method to print Employee Name
     */
    @Override
    public void employeeName() {
        System.out.println("Employee Name : Jack Sparrow");
    }

    /**
     *Method to print Employee Category
     */
    @Override
    public void employeeCategory() {
        System.out.println("I'm a Zoo maintainer");
    }

    /**
     *Method to print Employee ID
     */
    @Override
    public void employeeID() {
        System.out.println("My Employee ID is: 692939");
    }
}
