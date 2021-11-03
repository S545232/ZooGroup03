package edu.nwmissouri.zoo03group;

public class App {
    
    public static void main(String[] args) {
        
        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor("FirstTimeVisitor", "10$", "name", "email.com", 1234567890);
        firstTimeVisitor.getName();
        firstTimeVisitor.getEmail();
        firstTimeVisitor.getPhoneNumber();
        firstTimeVisitor.ticketPrice();
        firstTimeVisitor.visitorCategory();
    }
    
}
