package com.example;

//In Main ask the user (using Scanner) to choose one of the months
// (show the month using the English name)

//In an ArrayList add all the months for the given month and all the following months.
// This can be done many ways but an elegant solution can be coded using a switch statement.

//Show the list to the user.

import com.example.common.Month;


import java.util.Scanner;

import static com.example.common.Month.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanagain = new Scanner(System.in);

        Month[] myMonthArray = Month.values();

        System.out.println("Please choose a month: ");

        java.util.ArrayList<Month> monthCol = new java.util.ArrayList<>();

        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        String monthCalled =scanagain.next();


        switch (monthCalled) {
            case "January":
                monthCol.add(Month.JANUARY);
            case "February":
                monthCol.add(Month.FEBRUARY);
            case "March":
                monthCol.add(Month.MARCH);
            case "April":
                monthCol.add(Month.APRIL);
            case "May":
                monthCol.add(Month.MAY);
            case "June":
                monthCol.add(Month.JUNE);
            case "July":
                monthCol.add(Month.JULY);
            case "August":
                monthCol.add(Month.AUGUST);
            case "September":
                monthCol.add(Month.SEPTEMBER);
            case "October":
                monthCol.add(Month.OCTOBER);
            case "November":
                monthCol.add(Month.NOVEMBER);
            case "December":
                monthCol.add(Month.DECEMBER);
                break;
            default:
                break;
        }

        if (monthCol.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (Month anotherMonth: monthCol) {
                System.out.println(anotherMonth.getEnglishName());
            }
//            for (int i = 0; i < myMonthArray.length; i++) {
//                System.out.println(myMonthArray[i]);
//
//            }

//            String userInput = scanagain.nextLine();

        }
    }
}






