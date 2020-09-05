package com.company;

import java.util.*;

/**
 * Java program to find if a year is leap year or not.
 * A leap year which contains 366 days, which is 1 day more
 * of normal 365 days year.
 * Lear year comes in a interval of 4 years. In Gregorian calendar
 * in leap year February has 29 days which is 1 day more than 28 days in normal year
 * */

public class LearYearProgram {
    public static void main(String[] args) {
        //Testing some leap and non leap year using Java library code
        System.err.println("Is 2000 a leap year ? : " + isLeapYear(2000));
        System.err.println("Is 2012 a leap year ? : " + isLeapYear(2012));
        System.err.println("Is 1901 a leap year ? : " + isLeapYear(1901));
        System.err.println("Is 1900 a leap year ? : " + isLeapYear(1900));
        //Checking leap year without using library or API and applying logic
        System.err.println("Does 2000 a leap year ? : " + doesLeapYear(2000));
        System.err.println("Does 2012 a leap year ? : " + doesLeapYear(2012));
        System.err.println("Does 1901 a leap year ? : " + doesLeapYear(1901));
        System.err.println("Does 1900 a leap year ? : " + doesLeapYear(1900));
    }

    /*
     * This method checks whether a year is leap or not by using Java Date and Time API
     * Calendar class has utility method to return maximum number of dates in a year
     * which can be used to check if its greater than 365 or not
     * */
    public static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        //Gets Calendar based on local timezone and local
        cal.set(Calendar.YEAR, year);
        //setting the calendar year
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        if (noOfDays > 365) {
            return true;
        }
        return false;
    }
    /*
    * This method uses standard logic to check leap year in Java.
    * A year is a leap if it's multiple of 400 or multiple of 4 but not 100
    * */
    public static boolean doesLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0));
    }
}