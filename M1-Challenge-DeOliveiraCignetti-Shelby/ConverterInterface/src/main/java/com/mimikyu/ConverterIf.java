package com.mimikyu;

public class ConverterIf implements Converter{
    public String convertMonth(int monthNumber) {
        int i = monthNumber;
        String monthString = "";
        if (i == 1) {
            monthString = "January";
        } else if (i == 2) {
            monthString = "February";
        } else if (i == 3) {
            monthString = "March";
        } else if (i == 4) {
            monthString = "April";
        } else if (i == 5) {
            monthString = "May";
        } else if (i == 6) {
            monthString = "June";
        } else if (i == 7) {
            monthString = "July";
        } else if (i == 8) {
            monthString = "August";
        } else if (i == 9) {
            monthString = "September";
        } else if (i == 10) {
            monthString = "October";
        } else if (i == 11) {
            monthString = "November";
        } else if (i == 12) {
            monthString = "December";
        } else {
            monthString = "Invaild Entry";
        }
        return "ConverterIf: " + monthString;
    }

    public String convertDay(int dayNumber) {
        int i = dayNumber;
        String dayString = "";
        if (i == 1) {
            dayString = "Sunday";
        } else if (i == 2) {
            dayString = "Monday";
        } else if (i == 3) {
            dayString = "Tuesday";
        } else if (i == 4) {
            dayString = "Wednesday";
        } else if (i == 5) {
            dayString = "Thursday";
        } else if (i == 6) {
            dayString = "Friday";
        } else if (i == 7) {
            dayString = "Saturday";
        } else {
            dayString = "Invaild Entry";
        }
        return "ConverterIf: " + dayString;
    }
}