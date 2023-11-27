package com.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarADayTest {

    @Test
    void assert_correct_value_returned(){
        DollarADay dollarADay = new DollarADay();
        int expected = 406;
        int actual = dollarADay.calculateTotal(28);

        assertEquals(expected, actual);
    }

    @Test
    void throws_zero_error(){
        DollarADay dollarADay = new DollarADay();
        int expected = 0;
        int actual = dollarADay.calculateTotal(0);

        assertEquals(expected, actual);
    }
}