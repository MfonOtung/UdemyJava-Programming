package org.mfon.section10_Lists_ArrayLists_LinkedList;
/*
Create a simple banking application, with a Customer and Bank type. The Customer will have a name, and an ArrayList of
transactions containing Double wrapper elements. A customer's transaction can be a credit, which means a positive amount,
or it can be a debit, a negative amount. The Bank will have a name, and an ArrayList of customers. The bank should add a
new customer, if they're not yet already in the list. The bank class should allow a customer to add a transaction, to an
existing Customer. This class should also print a statement, that includes the customer name, and the transaction amounts.
This method should use unboxing.

Remember, it doesn't have to be terribly complicated, just keep it pretty basic.
The customer's literally only the name and the transactions at this stage.
You don't need to store customer contract addresses or anything like that.
The main thing is the relationship between the various classes, and also the auto
boxing and unboxing
 */

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class AutoboxingChallengeWithArrayLists {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);
    public Bank(String name) {
        this.name = name;
    }
    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }
}
