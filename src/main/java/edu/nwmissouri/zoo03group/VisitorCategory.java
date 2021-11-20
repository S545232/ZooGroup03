/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo03group;

/**
 * An Enum class which describes all categories of the Visitor
 *
 * @author Satya Sai Vinuthna Tummala
 */
public enum VisitorCategory {

    /**
     * Which is to represent first time visitor
     */
    FIRST_TIME_VISITOR("First Time Visitor"),
    /**
     * Which is to represent student visitor
     */
    STUDENT_VISITOR("Student Visitor"),
    /**
     * Which is to represent senior citizen visitor
     */
    SENIOR_CITIZEN_VISITOR("Senior Citizen Visitor"),
    /**
     * Which is to represent child visitor
     */
    CHILD_VISITOR("Child Visitor"),
    /**
     * Which is to represent adult visitor
     */
    ADULT_VISITOR("Adult Visitor");

    /**
     * Attribute of visitor Enum
     */
    private final String visitorEnum;

    /**
     * Parameterized Constructor for visitor Enum
     *
     * @param visitorEnum
     */
    private VisitorCategory(String visitorEnum) {
        this.visitorEnum = visitorEnum;
    }

    /**
     * Getter Method to get visitorEnum
     *
     * @return visitorEnum
     */
    public String getVisitorEnum() {
        return visitorEnum;
    }

    /**
     * Method to handle exception when we tried to get sub-string which is out of actual string length
     */
    public static void updateEnumValue() {
        try {
            String subEnum = VisitorCategory.SENIOR_CITIZEN_VISITOR.getVisitorEnum().substring(0, 30);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
