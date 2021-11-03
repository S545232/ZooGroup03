/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 *
 * @author Hari Hara Mummadi
 */
public class Employee extends Person {
    
    private int employeeID;
    private String employeeCategory;
    private String employeeName;
    private String employeeShiftTimings;

    public Employee(int employeeID, String employeeCategory, String employeeName, String employeeShiftTimings, String name, String email, int phoneNumber) {
        super(name, email, phoneNumber);
        this.employeeID = employeeID;
        this.employeeCategory = employeeCategory;
        this.employeeName = employeeName;
        this.employeeShiftTimings = employeeShiftTimings;
    }


    
    public void employeeID(){
        System.out.println("Employee ID");
    }
    public void employeeCategory(){
        System.out.println("Employeecategory printing");
    }
    public void employeeName(){
        System.out.println("Employee Name is John");
    }
    public void employeeShiftTimings(){
        System.out.println("Employee shift timings ");
    }
    @Override
    public void getName() {
        System.out.println("Employee name : Alex");
    }

    @Override
    public void getEmail() {
        System.out.println("Employee email : alex123@gmail.com");
    }

    @Override
    public void getPhoneNumber() {
        System.out.println("Employee mobile number : +1 62524353738");
    }
}
