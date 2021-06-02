package com.mimikyu;

import java.util.Scanner;

public class ConverterSwitch implements Converter{
    String convertMonth(int monthNumber){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter month's number: ");

//      Month
        switch (monthNumber){
            case 1:
                return "January";
                break;

            case 2:
                return "February";
                break;

            case 3:
                return "March";
                break;

            case 4:
                return "April";
                break;

            case 5:
                return "May";
                break;

            case 6:
                return "June";
                break;

            case 7:
                return "July";
                break;

            case 8:
                return "August";
                break;

            case 9:
                return "September";
                break;

            case 10:
                return "October";
                break;

            case 11:
                return "November";
                break;

            case 12:
                return "December";
                break;

            default:
                return "Invalid month.";
                break;
        }

    }
    String convertDay(int dayNumber){
//      Day
        switch (dayNumber){
            case 1:
                return "Sunday";
                break;

            case 2:
                return "Monday";
                break;

            case 3:
                return "Tuesday";
                break;

            case 4:
                return "Wednesday";
                break;

            case 5:
                return "Thursday";
                break;

            case 6:
                return "Friday";
                break;

            case 7:
                return "Saturday";
                break;

            default:
                return "Invalid Day.";
                break;
        }

    }

}



