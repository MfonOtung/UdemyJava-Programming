package org.mfon.section7;

import org.mfon.section7.OOPInheritance.BankAccount;



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
    }
}
