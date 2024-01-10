package org.mfon.section7;

import org.mfon.section7.OOPInheritance.BankAccount;



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
