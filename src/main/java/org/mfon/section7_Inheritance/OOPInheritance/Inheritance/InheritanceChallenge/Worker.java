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
public class Worker {
//    public static void main(String[] args) {
////        Employee jang = new Employee("Jang", "08/09/1950", "30/07/1980");
////        System.out.println(jang);
////        System.out.println("Age = " + jang.getAge());
////        System.out.println("Pay = " + jang.collectPay());
////
////        Employee jangjing = new Employee("Jang Jing", "08/09/1963", "30/07/1995");
////        System.out.println(jangjing);
////        System.out.println("Age = " + jang.getAge());
////        SalariedEmployee bayer = new SalariedEmployee("Bayer", "24/03/1990", "02/08/2010", 560000);
////        System.out.println("Bayers's paycheck = $" + bayer.collectPay());
////
////        bayer.retire();
////        System.out.println("Bayer's Pension check = $" + bayer.collectPay());
////
////        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
////        System.out.println(mary);
////        System.out.println("Mary's paycheck = $" + mary.collectPay());
////        System.out.println("Mary's holiday Pay = $" + mary.getDoublePay());
////
//
//    }
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate (String endDate){
        this.endDate = endDate;
    }
}
