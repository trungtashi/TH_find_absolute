package calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Number0Expected0")
    void testFindAbsolute0(){
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Number1Expected1")
    void testFindAbsolute1(){
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Number1Expected1")
    void testFindAbsoluteNegative1(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}