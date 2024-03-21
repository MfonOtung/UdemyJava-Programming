package org.mfon.section10_Lists_ArrayLists_LinkedList.CodingExercises.Exercise3;
/*
BANKING:
Your job is to create a simple banking application.
Implement the following classes:
1.  Bank

-  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
-  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
-  And five methods, they are (their functions are in their names):
    -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the
        branch was added successfully or false otherwise.
    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer),
        double (initial transaction) and returns a boolean. It returns true if the customer was added successfully
        or false otherwise.
    -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer),
        double (transaction) and returns a boolean. It returns true if the customers transaction was added successfully
        or false otherwise.
    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it
        exists or null otherwise.
    -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns
        a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers.

→ TEST CODE

Bank bank = new Bank("National Australia Bank");

bank.addBranch("Adelaide");

bank.addCustomer("Adelaide", "Tim", 50.05);
bank.addCustomer("Adelaide", "Mike", 175.34);
bank.addCustomer("Adelaide", "Percy", 220.12);

bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

bank.listCustomers("Adelaide", true);
→ OUTPUT

The list of customers should be printed out in the following format if boolean parameter is true:

Customer details for branch Adelaide
Customer: Tim[1]
Transactions
[1] Amount 50.05
[2] Amount 44.22
[3] Amount 12.44
Customer: Mike[2]
Transactions
[1] Amount 175.34
[2] Amount 1.65
Customer: Percy[3]
Transactions
[1] Amount 220.12
and if false, only the customers - no transactions:

bank.listCustomers("Adelaide", false);
Customer details for branch Adelaide
Customer: Tim[1]
Customer: Mike[2]
Customer: Percy[3]
 */

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }

    public boolean addBranch(String branchName) {

        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {

        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
