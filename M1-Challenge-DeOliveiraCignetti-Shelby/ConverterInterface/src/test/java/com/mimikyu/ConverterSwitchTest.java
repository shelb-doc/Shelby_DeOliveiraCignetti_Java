package com.mimikyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch month3 = new ConverterSwitch();
    ConverterSwitch day4 = new ConverterSwitch();

    @Test
    public void shouldConvertWithinRanges() {

        assertEquals("ConverterSwitch: August", month3.convertMonth(8));
        assertEquals("ConverterSwitch: Saturday", day4.convertDay(7));
    }

    @Test
    public void shouldReturnErrorOutsideRanges() {

        assertEquals("ConverterSwitch: The number you entered does not correspond to a month of the year.", month3.convertMonth(13));
        assertEquals("ConverterSwitch: The number you entered does not correspond to a day of the week.", day4.convertDay(8));
    }
}