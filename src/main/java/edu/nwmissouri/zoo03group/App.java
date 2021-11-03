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
}
