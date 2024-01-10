package org.mfon.section7;

import org.mfon.section7.OOPInheritance.BankAccount;

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

public class ClassChallenge {
    public static void main(String[] args) {
        BankAccount customerAccount = new BankAccount();
        customerAccount.withdrawFunds(100000);
        customerAccount.depositFunds(100000);
        customerAccount.withdrawFunds(100000);

        customerAccount.setName("Mary Jerks");
        customerAccount.setAccountNumber("002233441");
        customerAccount.setEmail("MarJeks@Test.com");
        customerAccount.setPhoneNumber("070855442");
        customerAccount.setAccountBalance(100000);
    }
}
