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

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatement("Jane a");

        bank.addNewCustomer("bob s", 25);
        bank.addTransaction("Bob S", 100);
        bank.printStatement("Bob S");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer (String customerName){

            for (var customer : customers) {
                if (customer.name().equalsIgnoreCase(customerName)) {
                    return customer;
                }
            }
            System.out.printf("Customer (%s) wasn't found %n", customerName);
            return null;
        }

        public void addNewCustomer (String customerName,double initialDeposit){

            if (getCustomer(customerName) == null) {
                Customer customer = new Customer(customerName, initialDeposit);
                customers.add(customer);
                System.out.println("New Customer added: " + customer);
            }
        }

        public void addTransaction (String name,double transactionAmount){

            Customer customer = getCustomer(name);
            if (customer != null) {
                customer.transactions().add(transactionAmount);
            }
        }public void printStatement(String customerName) {

            Customer customer = getCustomer(customerName);
            if (customer == null) {
                return;
            }

            System.out.println("-".repeat(30));
            System.out.println("Customer Name: " + customer.name());
            System.out.println("Transactions:");
            for (double d : customer.transactions()) {  // unboxing
                System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
            }

        }

    }
