package org.mfon.section6;

/**
 1. Create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values.

 Use the enhanced switch statement, to return the name of the day, based on the parameter passed to the switch statement, so that 0 will return "Sunday", 1 will return "Monday" and so on. Any number not between o and 6, should return "Invalid Day",

 Use the enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.

 2. In the main method, call this method for the values 0 through 7.
 3. Bonus: Create a second method called printWeekDay, that uses an if then else statement, instead of a switch, to produce the same output.
 */
public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        //Translate letters "A - E" into NATO's keyword representing the letters
//        char natoValue = 'G';
//        switch (natoValue) {
//            case 'A':
//                System.out.println("A is Able ");
//                break;
//            case 'B':
//                System.out.println("B is Baker");
//                break;
//            case 'C':
//                System.out.println("C is Charlie");
//                break;
//            case 'D':
//                System.out.println(" D is Dog");
//                break;
//            case 'E':
//                System.out.println(" E is Easy");
//                break;
//            default:
//                System.out.println("Letter " + natoValue + " is not found in the switch");
//                break;
//        }
        printDayOfWeek(4);
        System.out.println(dayOfWeek(4));
        printWeekDay(4);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static String dayOfWeek(int day) {
        return switch (day){
            case 0 -> "Day of the week is Sunday";
            case 1 -> "Day of the week is Monday";
            case 2 -> "Day of the week is Tuesday";
            case 3 -> "Day of the week is Wednesday";
            case 4 -> "Day of the week is Thursday";
            case 5 -> "Day of the week is Friday";
            case 6 -> "Day of the week is Saturday";
            default -> {
                String notDay  = day + " represents an Invalid day";
                yield (notDay);
            }
        };
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1){
            dayOfWeek = "Monday";
        } else if (day == 2){
            dayOfWeek = "Tuesday";
        } else if (day == 3){
            dayOfWeek = "Wednesday";
        } else if (day == 4){
            dayOfWeek = "Thursday";
        } else if (day == 5){
            dayOfWeek = "Friday";
        } else if (day == 6){
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
