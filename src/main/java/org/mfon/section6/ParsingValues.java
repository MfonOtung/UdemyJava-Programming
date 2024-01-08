package org.mfon.section6;

public class ParsingValues {
    public static void main(String[] args) {
        String currentYear = "2024";
        String yearOfBirth = "1993";
        int thisYear = Integer.parseInt(currentYear);
        int birthYear = Integer.parseInt(yearOfBirth);
        System.out.println(thisYear - birthYear);

        String userAgeWithPartialYear = "20.5";
        double ageOfUserAgeWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("User age is " + ageOfUserAgeWithPartialYear);


    }
}
