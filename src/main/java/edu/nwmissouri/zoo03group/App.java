package edu.nwmissouri.zoo03group;

public class App {

    public static void main(String[] args) {

        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor("FirstTimeVisitor", "10$", "name", "email.com", 1234567890);
        firstTimeVisitor.getName();
        firstTimeVisitor.getEmail();
        firstTimeVisitor.getPhoneNumber();
        firstTimeVisitor.ticketPrice();
        firstTimeVisitor.visitorCategory();

        initStudentVisitor();
        initChildVisitor();
        initSeniorCitizenVisitor();
        initAdultVisitor();
        initEmployeeCareTaker();
        initEmployeeRescueOperator();
        initEmployeeGuide();
        initZooMaintainer();
    }

    private static void initStudentVisitor() {
        StudentVisitor studentVisitor = new StudentVisitor("StudentVisitor", "6$", "jj rodson", "rodson@gmail.com", 1234567890, "School of California");
        studentVisitor.ticketPrice();
        studentVisitor.visitorCategory();
        studentVisitor.school();
    }

    private static void initChildVisitor() {
        ChildVisitor childVisitor = new ChildVisitor("ChildVisitor", "5$", "jj rodson", "rodson@gmail.com", 1234567890, 4, "I need a Stroller");
        childVisitor.ticketPrice();
        childVisitor.visitorCategory();
        childVisitor.zooStroller();
    }

    private static void initSeniorCitizenVisitor() {
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor("SeniorCitizenVisitor", "4$", "jj rodson", "rodson@gmail.com", 62, "I need Wheel Chair");
        seniorCitizenVisitor.ticketPrice();
        seniorCitizenVisitor.visitorCategory();
        seniorCitizenVisitor.zooWheelChair();
    }

    private static void initAdultVisitor() {
        AdultVisitor adultVisitor = new AdultVisitor("AdultVisitor", "8.5$", "name", "email.com", 1234567890);
        adultVisitor.ticketPrice();
        adultVisitor.visitorCategory();
    }

    private static void initEmployeeCareTaker() {
        EmployeeCareTaker employeeCareTaker = new EmployeeCareTaker(865432, "EmployeeCareTaker", "Employee name", "9am-5pm", "name", "email", 1234567890);
        employeeCareTaker.getName();
        employeeCareTaker.getEmail();
        employeeCareTaker.getPhoneNumber();
        employeeCareTaker.employeeShiftTimings();
        employeeCareTaker.employeeName();
        employeeCareTaker.employeeCategory();
        employeeCareTaker.employeeID();

    }

    private static void initEmployeeRescueOperator() {

        EmployeeRescueOperators employeeRescueOperators = new EmployeeRescueOperators(673739, "Employee Rescue Operator", "John Greesham", "6AM-1PM", "name", "email", 188292829);
        employeeRescueOperators.employeeCategory();
        employeeRescueOperators.employeeID();
        employeeRescueOperators.employeeName();
        employeeRescueOperators.employeeShiftTimings();
    }

    private static void initEmployeeGuide() {

        EmployeeGuide employeeGuide = new EmployeeGuide(682939, "Employee Guide", "Tony Stark", "10AM-6PM", "name", "email", 1982882882);
        employeeGuide.employeeCategory();
        employeeGuide.employeeID();
        employeeGuide.employeeName();
        employeeGuide.employeeShiftTimings();
    }

    private static void initZooMaintainer() {

        ZooMaintainer zooMaintainer = new ZooMaintainer(692939, "Zoo Maintainer", "Jack Sparrow", "9AM-7PM", "name", "email", 1788298277);
        zooMaintainer.employeeCategory();
        zooMaintainer.employeeID();
        zooMaintainer.employeeName();
        zooMaintainer.employeeShiftTimings();
    }
}
