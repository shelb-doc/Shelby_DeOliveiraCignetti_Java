package com.mimikyu;

public class ConverterApplication {
    public static void main(String[] args) {

        // ConverterIf Instance
        ConverterIf month1 = new ConverterIf();
        ConverterIf day1 = new ConverterIf();
        System.out.println(month1.convertMonth(8));
        System.out.println(day1.convertDay(13));

        // ConverterSwitch Instance
        ConverterSwitch month2 = new ConverterSwitch();
        ConverterSwitch day2 = new ConverterSwitch();
        System.out.println(month2.convertMonth(15));
        System.out.println(day2.convertDay(6));

    }
}