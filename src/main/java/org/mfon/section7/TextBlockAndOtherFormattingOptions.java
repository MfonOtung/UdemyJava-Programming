package org.mfon.section7;

public class TextBlockAndOtherFormattingOptions {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);


        String textBlock = """
                 Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age); //Insert the escape sequence, \n to print on a new line
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, yearOfBirth);



        int age1 = 35;
        System.out.printf("Your age is %d%n", age); //Replace \n with format specifier %n. The difference between \n and %n is that %n outputs the platform's specific line separator//
        int yearOfBirth1 = 2023 - age1;
        System.out.printf("Age = %d, Birth year = %d%n", age1, yearOfBirth1);
        //System.out.printf("Age = %d, Birth year = %f%n", age1); //Throws a conversion exception error because age1 is not a float but an integer
        System.out.printf("Your age is %f%n", (float) age1);//Parsing age1 to a float.
        //To display age1 in 2 decimal places, %f%n can be replaced by  %.2f%n.


        //How to format the width of numbers
        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %d%n", i);
        }
        //The width of the numbers can be specified to a number equal to the number of digits of the largest value in order to align them on the right.
        for (int j = 1; j <= 100000; j *= 10){
            System.out.printf("Printing %6d%n", j);
        }

        //To format string
        String formattedString = String.format("Your age is %d, age");
        System.out.println(formattedString);
    }
}