package org.mfon.section7_Inheritance.OOPInheritance.Inheritance.InheritanceChallenge;
/**
 Your challenge is to create the Worker class, the Employee class, and either the SalariedEmployee,
 or the HourlyEmployee class. You don't have to do both, but if you want to, go right ahead.
 For each class, create the attributes and methods shown on this diagram.
 Note that Employee has no methods of its own. Create a main method that will create either a
 SalariedEmployee or HourlyEmployee, and call the methods, getAge, collectPay,
 and the method shown for the specific type of class you decide to implement.
 So if you implement SalariedEmployee, then execute retire().
 If you implement HourlyEmployee, then execute getDoublePay().
 */
public class SalariedEmployee  extends Employee{
    private double annualSalary;
    private  boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay() {
        //return (int) annualSalary / 26; removed after creating method retire.
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired)? 0.9 * paycheck: paycheck;
        return (int) adjustedPay;
    }
    public  void retire() {
        terminate("31/12/2030");
        isRetired = true;
    }
}
