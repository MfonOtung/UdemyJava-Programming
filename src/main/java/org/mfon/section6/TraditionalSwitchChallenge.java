package org.mfon.section6;

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
        System.out.println(printWeekDay(4));
    }

    public static void printDayOfWeek(int day) {
        switch (day){
            case 0 -> System.out.println("Day of the week is Sunday");
            case 1 -> System.out.println("Day of the week is Monday");
            case 2 -> System.out.println("Day of the week is Tuesday");
            case 3 -> System.out.println("Day of the week is Wednesday");
            case 4 -> System.out.println("Day of the week is Thursday");
            case 5 -> System.out.println("Day of the week is Friday");
            case 6 -> System.out.println("Day of the week is Saturday");
            default -> System.out.println("Invalid Day");
        }
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

    public static String printWeekDay(int day) {
        if (day == 0){
            return "Day of the Week is Sunday";
        } else if (day == 1){
            return "Day of the Week is Monday";
        } else if (day == 2){
            return "Day of the Week is Tuesday";
        } else if (day == 3){
            return "Day of the Week is Wednesday";
        } else if (day == 4){
            return "Day of the Week is Thursday";
        } else if (day == 5){
            return "Day of the Week is Friday";
        } else if (day == 6){
            return "Day of the Week is Saturday";
        }else {
            return "Invalid Day";
        }
    }
}
