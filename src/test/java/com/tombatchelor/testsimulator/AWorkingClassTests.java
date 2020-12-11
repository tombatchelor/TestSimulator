package com.tombatchelor.testsimulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tom_n
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AWorkingClassTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        WorkingClass calculator = new WorkingClass();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }
    
        @Test
    @DisplayName("1 + 1 = 2")
    void subtractTwoNumbers() {
        WorkingClass calculator = new WorkingClass();
        assertEquals(0, calculator.subtract(1, 1), "1 - 1 should equal 0");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
        "0,    1,   1",
        "1,    2,   3",
        "49,  51, 100",
        "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        WorkingClass calculator = new WorkingClass();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    
    @ParameterizedTest(name = "[0] = [1]")
    @CsvSource({
        "'1', 1",
        "'3', 3",
        "'10', 10"
    })
    void parse(String input, int expectedResult) {
        WorkingClass calculator = new WorkingClass();
        assertEquals(expectedResult, calculator.toInt(input),
                () -> input + " should equal " + expectedResult);
    }
    
    
}
