package com.example.common;


//In the Month enum add the constants JANUARY through DECEMBER.

//Also add a private variable englishName which should be set to January through December and a getter.

//In an ArrayList add all the months for the given month and all the following months.
// This can be done many ways but an elegant solution can be coded using a switch statement.

//Show the list to the user.

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");


    private String englishName;

    public String getEnglishName() {
        return englishName;
    }

    Month(String englishName) {
        this.englishName = englishName;
    }
}