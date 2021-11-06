package edu.nwmissouri.zoo03group;

public class App {

    private static final String WELCOME_MESSAGE = "Welcome to the Pecky Blinders Zoo!! \n";
    private static final String VISIT_AGAIN_MESSAGE = "Thank you for visiting, Please visit again!! \n";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);

        initVisitorCategories();
        initFirstTimeVisitor();
        initStudentVisitor();
        initChildVisitor();
        initSeniorCitizenVisitor();
        initAdultVisitor();
        initEmployeeCategories();
        initEmployeeCareTaker();
        initEmployeeRescueOperator();
        initEmployeeGuide();
        initZooMaintainer();

        System.out.println(VISIT_AGAIN_MESSAGE);
    }

    private static void initVisitorCategories() {
        System.out.println("Available visitor categories are : \n"
                + VisitorCategory.FIRST_TIME_VISITOR + "\n"
                + VisitorCategory.STUDENT_VISITOR + "\n"
                + VisitorCategory.SENIOR_CITIZEN_VISITOR + "\n"
                + VisitorCategory.CHILD_VISITOR + "\n"
                + VisitorCategory.ADULT_VISITOR + "\n"
        );
    }

    private static void initFirstTimeVisitor() {
        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor("FirstTimeVisitor", "10$", "James Cameron", "james@live.com", 989578575);
        System.out.println(firstTimeVisitor.toString());
        firstTimeVisitor.ticketPrice();
        firstTimeVisitor.visitorCategory();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initStudentVisitor() {
        StudentVisitor studentVisitor = new StudentVisitor("StudentVisitor", "6$", "Christopher Nolan", "nolan@gmail.com", 660987542, "School of California");
        System.out.println(studentVisitor.toString());
        studentVisitor.ticketPrice();
        studentVisitor.visitorCategory();
        studentVisitor.school();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initChildVisitor() {
        ChildVisitor childVisitor = new ChildVisitor("ChildVisitor", "5$", "jj rodson", "rodson@gmail.com", 440675377, 4, "I need a Stroller");
        System.out.println(childVisitor.toString());
        childVisitor.ticketPrice();
        childVisitor.visitorCategory();
        childVisitor.age();
        childVisitor.zooStroller();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initSeniorCitizenVisitor() {
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor("SeniorCitizenVisitor", "4$", "Cillian Murphy", "murphy@gmail.com", 62, "I need Wheel Chair");
        System.out.println(seniorCitizenVisitor.toString());
        seniorCitizenVisitor.ticketPrice();
        seniorCitizenVisitor.visitorCategory();
        seniorCitizenVisitor.age();
        seniorCitizenVisitor.zooWheelChair();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initAdultVisitor() {
        AdultVisitor adultVisitor = new AdultVisitor("AdultVisitor", "8.5$", "Ryan Rodney Reynolds", "ryan@gmail.com", 514778899);
        System.out.println(adultVisitor.toString());
        adultVisitor.ticketPrice();
        adultVisitor.visitorCategory();
        adultVisitor.visitorOccupation();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initEmployeeCategories() {
        System.out.println("Available Zoo Employee categories are : \n"
                + EmployeeCategory.EMPLOYEE_CARE_TAKER + "\n"
                + EmployeeCategory.EMPLOYEE_RESCUE_OPEARTORS + "\n"
                + EmployeeCategory.EMPLOYEE_GUIDE + "\n"
                + EmployeeCategory.ZOO_MAINTAINER + "\n"
        );
    }

    private static void initEmployeeCareTaker() {
        EmployeeCareTaker employeeCareTaker = new EmployeeCareTaker(865432, "EmployeeCareTaker", "David", "9am-5pm", "name", "david@gmail.com", 834569972);
        System.out.println(employeeCareTaker.toString());
        employeeCareTaker.employeeShiftTimings();
        employeeCareTaker.employeeCategory();
        employeeCareTaker.employeeID();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initEmployeeRescueOperator() {

        EmployeeRescueOperators employeeRescueOperators = new EmployeeRescueOperators(673739, "Employee Rescue Operator", "John Greesham", "6AM-1PM", "John Greesham", "john@gmail.com", 788292829);
        System.out.println(employeeRescueOperators.toString());
        employeeRescueOperators.employeeCategory();
        employeeRescueOperators.employeeID();
        employeeRescueOperators.employeeShiftTimings();
        employeeRescueOperators.getInsuranceProvider();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initEmployeeGuide() {
        EmployeeGuide employeeGuide = new EmployeeGuide(682939, "Employee Guide", "Tony Stark", "10AM-6PM", "Tony Stark", "tony@gmail.com", 498288282);
        System.out.println(employeeGuide.toString());
        employeeGuide.employeeCategory();
        employeeGuide.employeeID();
        employeeGuide.employeeShiftTimings();
        employeeGuide.getLanguagesKnown();
        System.out.println("\n***********************************************************************************\n");
    }

    private static void initZooMaintainer() {
        ZooMaintainer zooMaintainer = new ZooMaintainer(692939, "Zoo Maintainer", "Jack Sparrow", "9AM-7PM", "Jack Sparrow", "jack@gmail.com", 478828277);
        System.out.println(zooMaintainer.toString());
        zooMaintainer.employeeCategory();
        zooMaintainer.employeeID();
        zooMaintainer.employeeShiftTimings();
        zooMaintainer.getMaintenanceProvider();
        System.out.println("\n***********************************************************************************\n");
    }
}
