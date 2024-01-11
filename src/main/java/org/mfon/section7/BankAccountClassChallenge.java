package org.mfon.section7;

import org.mfon.section7.OOPInheritance.BankAccount;
import org.mfon.section7.OOPInheritance.Customer;


public class BankAccountClassChallenge {
    public static void main(String[] args) {
        //To call another constructor within a constructor - Chain constructor:
        BankAccount customerAccount = new BankAccount();

        System.out.println(customerAccount.getAccountNumber());
        System.out.println(customerAccount.getAccountBalance());

        //BankAccount customerAccount = new BankAccount(); with the constructor with parameters.
        //BankAccount customerAccount = new BankAccount("Mary Jerks", "002233441", "MarJeks@Test.com", "070855442", 100000);

        customerAccount.withdrawFunds(100000);
        customerAccount.depositFunds(100000);
        customerAccount.withdrawFunds(100000);

        customerAccount.setName("Mary Jerks");
        customerAccount.setAccountNumber("002233441");
        customerAccount.setEmail("MarJeks@Test.com");
        customerAccount.setPhoneNumber("070855442");
        customerAccount.setAccountBalance(100000);

        BankAccount zitasAccount = new BankAccount("Zita", "zita@test.com", "089114");
        System.out.println("AccountNo: " + zitasAccount.getAccountNumber() + "; name " + zitasAccount.getName());

        Customer neoSAccount = new Customer("Neo", "neo1@test.com");
        System.out.println("Account Name: " + neoSAccount.getName()  + "; Credit Limit: " + neoSAccount.getCreditLimit());

        Customer corporate = new Customer();
        System.out.println(corporate.getName());
        System.out.println(corporate.getCreditLimit());

        //Customer client = new Customer("Amos", 2900, "amos3@test.com");
    }
}
