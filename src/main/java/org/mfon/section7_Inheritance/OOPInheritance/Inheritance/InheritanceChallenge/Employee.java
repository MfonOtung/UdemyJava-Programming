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
public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1; //To generate a sequence of employee Id, we take off the employeeId from the parameters in the constructor; make it static = 1, and ++ its this. We remove the Id on the main and Employee constructor because the constructor will generate it itself.//

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " employee Id = " + employeeId + ", " + "hire date = " + hireDate;
    }
}
