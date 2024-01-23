package org.mfon.section7Inheritance.OOPInheritance.PlainOldJavaObjects;

public class RecordProject {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i, /*Replacing parameter name - "Mary" with a switch statement*/
                switch (i){
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    case 5 -> "Lisa";
                    default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }
        //To compare the printout of toString and record:
        Student pojoStudent = new Student ("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent ("S923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        //Setting data on two types of students:
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829");

        //To print out a couple of the attributes using the accessor (or getter) methods:
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());



    }
}
