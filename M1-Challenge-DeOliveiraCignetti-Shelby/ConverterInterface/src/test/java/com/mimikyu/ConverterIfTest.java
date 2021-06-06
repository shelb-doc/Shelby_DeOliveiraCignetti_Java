package com.mimikyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf month3 = new ConverterIf();
    ConverterIf day4 = new ConverterIf();

    @Test
    public void shouldConvertWithinRanges() {

        assertEquals("ConverterIf: August", month3.convertMonth(8));
        assertEquals("ConverterIf: Saturday", day4.convertDay(7));
    }

    @Test
    public void shouldReturnErrorOutsideRanges() {

        assertEquals("ConverterIf: The number you entered does not correspond to a month of the year.", month3.convertMonth(13));
        assertEquals("ConverterIf: The number you entered does not correspond to a day of the week.", day4.convertDay(8));
    }

}