package org.mfon.section6_Control_Flow;

import java.util.Scanner;

public class ParsingValues {
    public static void main(String[] args) {
//        String currentYear = "2024";
//        String yearOfBirth = "1993";
//        int thisYear = Integer.parseInt(currentYear);
//        int birthYear = Integer.parseInt(yearOfBirth);
//        System.out.println(thisYear - birthYear);
//
//        String userAgeWithPartialYear = "20.5";
//        double ageOfUserAgeWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("User age is " + ageOfUserAgeWithPartialYear);

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        //String name = System.console().readLine("Hi, what is your name?");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        //String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            //String dateOfBirth = scanner.nextLine();
            //age = currentYear - Integer.parseInt(dateOfBirth);
            //Replace the upper 2 statements with the validation statements below:
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! Try again.");
            }
            //To restrict the input of character in year of birth, we use the try and catch statements:
        } while (!validDOB);

        return "So you are " + age + " years old";
    }
    //Adding conditions to achieve a set range of age; the use a Do-While loop in method getInputFromScanner
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
