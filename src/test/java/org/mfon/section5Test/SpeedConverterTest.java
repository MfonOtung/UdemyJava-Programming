package org.mfon.section5Test;


import org.junit.jupiter.api.Test;
import org.mfon.section5.SpeedConverter;

public class SpeedConverterTest {

    @Test
    void toMileTestNegative(){
       assert SpeedConverter.toMilesPerHour(-34) == -1;
    }

    @Test
    void checkIf1coma5kmIs1mile(){
        assert  SpeedConverter.toMilesPerHour(1.5) == 1;
    }

    @Test
    void toMiles10Point25MustBe6() {
        assert  SpeedConverter.toMilesPerHour(10.25) == 6;
    }

    @Test
    void toMiles25Point42MustBe16() {
        assert  SpeedConverter.toMilesPerHour(25.42) == 16;
    }

    @Test
    void toMiles75Point114MustBe47() {
        assert  SpeedConverter.toMilesPerHour(75.114) == 47;
    }

    @Test
    void convert1Point5KilometersToMilesShouldBe1() {
        assert  SpeedConverter.printConversion(1.5); == 1;
    }

}
