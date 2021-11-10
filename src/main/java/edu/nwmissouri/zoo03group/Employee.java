/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * This Class is about Employee which extends AbstractPerson
 * @author Hari Hara Mummadi
 */
public class Employee extends AbstractPerson {
    
    private int employeeID;
    private EmployeeCategory employeeCategory;
    private String employeeName;
    private String employeeShiftTimings;

    /**
     * Constructor for Employee Class
     * @param employeeID
     * @param employeeCategory
     * @param employeeName
     * @param employeeShiftTimings
     * @param name
     * @param email
     * @param phoneNumber
     */
    public Employee(int employeeID, EmployeeCategory employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(name, email, phoneNumber);
        this.employeeID = employeeID;
        this.employeeCategory = employeeCategory;
        this.employeeName = employeeName;
        this.employeeShiftTimings = employeeShiftTimings;
    }

    /**
     * Method for employee ID
     */
    public void employeeID(){
        System.out.println("Employee ID");
    }

    /**
     * Method for Employee category
     */
    public void employeeCategory(){
        System.out.println("Employeecategory printing");
    }

    /**
     * Method  for Employee name
     */
    public void employeeName(){
        System.out.println("Employee Name is John");
    }

    /**
     * Method for Employee Shift Timings
     */
    public void employeeShiftTimings(){
        System.out.println("Employee shift timings ");
    }

    /**
     * An Over riding method which prints the name of the Zoo Employee 
     */
    @Override
    public void getName() {
        System.out.println("Employee name : Alex");
    }

    /**
     * An Over riding method which prints the Email of the Zoo Employee 
     */
    @Override
    public void getEmail() {
        System.out.println("Employee email : alex123@gmail.com");
    }

    /**
     * An Over riding method which prints the mobile number of the Zoo Employee 
     */
    @Override
    public void getPhoneNumber() {
        System.out.println("Employee mobile number : +1 62524353738");
    }
}
