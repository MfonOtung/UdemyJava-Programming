package org.mfon.section5Test;

import org.junit.jupiter.api.Test;
import org.mfon.section5.BarkingDog;
import org.mfon.section5.LeapYear;

public class LeapYearTest {
    @Test
    void year1600IsLeapYear(){
        assert LeapYear.isLeapYear(1600) == true;
    }

    @Test
    void yearNegative1600IsLeapYear(){
        assert LeapYear.isLeapYear(-1600) == false;
    }

    @Test
    void year1924IsLeapYear(){
        assert LeapYear.isLeapYear(1924) == true;
    }
    @Test
    void year2000IsLeapYear(){
        assert LeapYear.isLeapYear(2000) == true;
    }

    @Test
    void year2017IsLeapYear(){
        assert LeapYear.isLeapYear(2017) == false;
    }

    @Test
    void year2400IsLeapYear(){
        assert LeapYear.isLeapYear(2400) == true;
    }
}
