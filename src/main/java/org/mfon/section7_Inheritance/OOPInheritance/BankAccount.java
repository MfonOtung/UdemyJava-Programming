package org.mfon.section7_Inheritance.OOPInheritance;

/**
 Create a new class for a bank account. Create fields for account characteristics like:

 account number; account balance; customer name; email; and phone number

 Create getters and setters for each field. Create two additional methods:
 one for depositing funds into the account; and one for withdrawing funds from the account
 A customer should not be allowed to withdraw funds,if that withdrawal takes their balance negative.

 Create a new project called ClassesChallenge, with the usual Main class with the usual main method.
 You'll create an instance of an Account class, and then test your withdraw and deposit methods.
 You'll print information to the console, that confirms what the balance is after the methods are called.

 So, the challenge here is to create the Bank Account Blueprint, that has five instance fields.
 You want to make this class encapsulated, so you'll make all your attributes private,
 and set up getter and setter methods for your attributes.

 In addition, you'll have two behavioral methods, for depositing funds, and withdrawing funds.

 In addition to this class, you'll set up a Main class, with a main method,
 that creates at least one instance of the Bank Account class, and simulates depositing and
 withdrawing money from the account. And you may also want to add some System.out.println statements,
 to the two methods above as well, to confirm how much was deposited or withdrawn.
 */
public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;

    //Constructor: Has the same class name with the return type
    //Second Constructor:
    public BankAccount(){/** Calling another constructor(no arguments) within a contsructor */
        this("Default name", "002233441", "Default email", "Default phoneNumber", 1500.00);
        System.out.println("Empty constructor called");
    }
    //First Constructor:
    public BankAccount(String name, String accountNumber, String email, String phoneNumber, double accountBalance){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        email = email;
        phoneNumber = phoneNumber;
    }
    // Third Constructor: with only 3 parameters.
    public BankAccount(String name, String email, String phoneNumber) {
        this(name, "0022563441", email, phoneNumber, 2000.50);
       // this.name = name;
        //this.email = email;
        //this.phoneNumber = phoneNumber;
        // To call the first Contsructor  in here, we comment the 3 parameters and call the first constructor.
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdrawFunds(double withdrawnAmount) {
        if (accountBalance - withdrawnAmount < 0){
            System.out.println("Insufficient fund! You only have " + accountBalance + " in your account");
        }else {
            accountBalance -= withdrawnAmount;
            //System.out.println("Account Name: " + name);
            //System.out.println("Account Number: " + accountNumber);
            //System.out.println("Amount in Figure: " + withdrawnAmount);
            //System.out.println("Email Address: " + email);
            //System.out.println("Withdrawer's Phone Number: " + phoneNumber);
            System.out.println("Withdrawal of $" + withdrawnAmount + " made. New balance is $" + accountBalance);
        }
    }
    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        //System.out.println("Account Name: " + name);
        //System.out.println("Account Number: " + accountNumber);
        //System.out.println("Amount in Figure: " + depositAmount);
        //System.out.println("Email Address: " + email);
        //System.out.println("Depositor's Phone Number: " + phoneNumber);
        System.out.println("Deposit of $" + depositAmount + "  processed. New balance is $" + accountBalance);
    }
}
