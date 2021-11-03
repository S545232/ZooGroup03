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

}
