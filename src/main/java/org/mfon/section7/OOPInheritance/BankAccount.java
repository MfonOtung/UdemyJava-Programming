package org.mfon.section7.OOPInheritance;

public class BankAccount {
    private String accountNumber /**= "00223344551"*/;
    private double accountBalance /**= 500000*/;
    private String name /**= "Marilyn Jerks"*/;
    private String email /**= "customer@test.com"*/;
    private String phoneNumber/** = "0708965432"*/;


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
