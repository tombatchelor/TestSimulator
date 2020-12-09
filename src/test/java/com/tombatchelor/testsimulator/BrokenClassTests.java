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

public class BrokenClassTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        BrokenClass calculator = new BrokenClass();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }
    
        @Test
    @DisplayName("1 + 1 = 2")
    void subtractTwoNumbers() {
        BrokenClass calculator = new BrokenClass();
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
        BrokenClass calculator = new BrokenClass();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
