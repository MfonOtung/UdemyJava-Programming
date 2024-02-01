package org.mfon.section7_Inheritance.OOPInheritance.Inheritance.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee jang = new Employee("Jang", "08/09/1950", "30/07/1980");
        System.out.println(jang);
        System.out.println("Age = " + jang.getAge());
        System.out.println("Pay = " + jang.collectPay());

        Employee jangjing = new Employee("Jang Jing", "08/09/1963", "30/07/1995");
        System.out.println(jangjing);
        System.out.println("Age = " + jang.getAge());
        SalariedEmployee bayer = new SalariedEmployee("Bayer", "24/03/1990", "02/08/2010", 560000);
        System.out.println("Bayers's paycheck = $" + bayer.collectPay());

        bayer.retire();
        System.out.println("Bayer's Pension check = $" + bayer.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday Pay = $" + mary.getDoublePay());


    }
}
