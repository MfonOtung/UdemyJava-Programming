package org.mfon.section7.OOPInheritance;

/**
 Constructor Challenge:
 So for this challenge, you'll want to:
 1. Create a new class, called Customer, with three fields:
 name
 credit limit
 email address.

 2. Create the getter methods only, for each field. You don't need to create the setters.

 3. Create three constructors for this class:
 First, create a constructor for all three fields which should assign the arguments
 directly to the instance fields.
 Second, create a no args constructor that calls another constructor, passing some
 literal values for each argument.
 And lastly, create a constructor with just the name and email parameters, which also
 calls another constructor.
 */
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
//Tested on the main of ConstructorChallenge.

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
