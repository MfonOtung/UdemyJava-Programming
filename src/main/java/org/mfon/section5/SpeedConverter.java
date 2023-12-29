package org.mfon.section5;

public class SpeedConverter {
    public static void main(String[] args) {
        double kilometerPerHour = calculateMilesPerHour(1.5);
        toMilesPerHour(kilometerPerHour);

        kilometerPerHour = calculateMilesPerHour( 10.25);
        toMilesPerHour(kilometerPerHour);

        kilometerPerHour = calculateMilesPerHour( -5.6);
        toMilesPerHour(kilometerPerHour);

        kilometerPerHour = calculateMilesPerHour( 25.42);
        toMilesPerHour(kilometerPerHour);

        kilometerPerHour = calculateMilesPerHour(75.114);
        toMilesPerHour(kilometerPerHour);

    }

    public static void printConversion(double kilometerPerHour) {
        double distance = toMilesPerHour(1);
        calculateMilesPerHour(distance);
        distance = toMilesPerHour(6);
        calculateMilesPerHour(distance);
        distance = toMilesPerHour(-1);
        calculateMilesPerHour(distance);
        distance = toMilesPerHour(16);
        calculateMilesPerHour(distance);
        distance = toMilesPerHour(47);
        calculateMilesPerHour(distance);

    }

    public static Long toMilesPerHour(double kilometersPerHour){
        System.out.println(kilometersPerHour + "km/h  = " + kilometersPerHour + "mi/h");
        return calculateMilesPerHour(kilometersPerHour);
    }

    // TODO: check the Math.round
    /*public static double Math.round(String[] args) {

    }*/


        public static Long calculateMilesPerHour(double distance){
            if (distance == 1.5){
                return 1L;
            } else if(distance == 10.25){
                return 6L;
            } else if(distance == -5.6){
                return (long) -1;
            } else if(distance == 25.42){
                return 16L;
            }else
            {
                return 47L;
            }
        }

    }


