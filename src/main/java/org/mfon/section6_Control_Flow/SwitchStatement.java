package org.mfon.section6_Control_Flow;

public class SwitchStatement {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, a 5");
                System.out.println("Actually it was  a " + switchValue);
            }
            default -> System.out.println(" Was not 1, 2, 3, 4 or 5");
        }

        String month = "FEBRUARY";
        String month1 = "APRIL";
        String month2 = "JULY";
        String month3 = "OCTOBER";
        String month4 = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        System.out.println(month1 + " is in the " + getQuarter(month1) + " quarter");
        System.out.println(month2 + " is in the " + getQuarter(month2) + " quarter");
        System.out.println(month3 + " is in the " + getQuarter(month3) + " quarter");
        System.out.println(month4 + " is in the " + getQuarter(month4) + " quarter");


    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
