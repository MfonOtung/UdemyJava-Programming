package org.mfon.section5;

/**
 We want t create two methods with the same name: getDurationString
 The first method has one parameter of type int, named seconds.
 The second method has two parameters, named minutes and seconds, both ints.
 Both methods return a String in the format shown:
 "XXh YYm ZZs"
 where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.

 The first method should in turn call the second method to return its results.
 Make both method public and static as we've been doing so far in this course.
 Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.
 Start by creating a new project, and call it SecondsAndMinutesChallenge.

 Seconds And Minutes Challenge Bonus:

 For the first method, the seconds parameter should be >=0.
 For the second method, the minutes parameter should be >=0, and the seconds parameter should be >=0, and <=59.
 If either method is passed an invalid value, print out some type of meaningful message to the user.
 */
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0 ){
            return "Inputted value is invalid. It must be a positive value";
        }
        int minutes = seconds / 60;
        //int hour = seconds/ 3600;
//        int remainingMinutes = minutes % 60;
//        int remainingSeconds = seconds % 60;
//        if (seconds < 0){
//            System.out.println(getDurationString(minutes, seconds));
//        }
        return getDurationString(seconds / 60, seconds % 60);
    }

   // hour + "h " + remainingMinutes + "m " + remainingSeconds + "s"
    public static String getDurationString(int minutes, int seconds) {
       if (minutes < 0 ){
            return "Inputted value is invalid. It must be a positive value";
        }
        if (seconds < 0 || seconds > 59 ){
            return "Inputted value is invalid. Seconds must be between 0 and 59";
        }
        int totalMinutes = (minutes + (seconds/60));
        int hour = minutes / 60;
        int remainingSeconds = seconds % 60;
        int remainingMinutes = totalMinutes % 60;

        return hour + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
    }

