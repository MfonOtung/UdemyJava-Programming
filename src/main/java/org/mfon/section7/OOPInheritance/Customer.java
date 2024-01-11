package org.mfon.section7.OOPInheritance;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress){
        System.out.println("Customer constructor with all parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(){
        this("Cindy Jorge", 500000.00, "cinjorg@test.com");
        System.out.println("No Arguments Constructor called");
    }
    public Customer(String name, String emailAddress){
        this(name, 20000, emailAddress);
    }
//Tested on the main of BankAccountClassChallenge.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
