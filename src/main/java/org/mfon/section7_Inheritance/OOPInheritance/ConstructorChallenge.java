package org.mfon.section7_Inheritance.OOPInheritance;

public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer client = new Customer("Amos", 2900, "amos3@test.com");
        System.out.println(client.getName());
        System.out.println(client.getCreditLimit());
        System.out.println(client.getEmailAddress());

        Customer neoSAccount = new Customer("Neo", "neo1@test.com");
        System.out.println("Account Name: " + neoSAccount.getName()  + "; Credit Limit: " + neoSAccount.getCreditLimit());

        Customer corporate = new Customer();
        System.out.println(corporate.getName());
        System.out.println(corporate.getCreditLimit());
    }
}
