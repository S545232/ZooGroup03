/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This class is Zoo Maintainer
 *
 * @author Saitej Veerabathini
 */
public class ZooMaintainer extends Employee {

    /**
     * This is a constructor for this class
     *
     * @param employeeID
     * @param employeeCategory
     * @param employeeName
     * @param employeeShiftTimings
     * @param name
     * @param email
     * @param phoneNumber
     */
    public ZooMaintainer(int employeeID, EmployeeCategory employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(employeeID, employeeCategory, employeeName, employeeShiftTimings, name, email, phoneNumber);
    }

    /**
     * Method to print Maintenance Provider
     */
    public void getMaintenanceProvider() {
        System.out.println("SARUS company provides maintenance facility to the Zoo.");
    }

    /**
     * Method to print Employee Shift Timings
     */
    @Override
    public void employeeShiftTimings() {
        System.out.println("My shift timings are : 9AM - 7PM");
    }

    /**
     * Method to print Employee Name
     */
    @Override
    public void employeeName() {
        System.out.println("Employee Name : Jack Sparrow");
    }

    /**
     * Method to print Employee Category
     */
    @Override
    public void employeeCategory() {
        System.out.println("I'm a Zoo maintainer");
    }

    /**
     * Method to print Employee ID
     */
    @Override
    public void employeeID() {
        System.out.println("My Employee ID is: 692939");
    }

    /**
     * Method to handle the array index exception
     */
    public static void arrayIndexException() {
        int ar[] = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= ar.length; i++) {
                System.out.println(ar[i]);
            }
        } catch (Exception e) {
            System.out.println("This is an array index out of bound exception.");
            e.printStackTrace();

        } finally {

            System.out.println("Finally block will execute irrespective of try-catch block");
        }
    }
}
