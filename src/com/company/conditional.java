package com.company;

public class conditional {

    public boolean isLeapYear(int year)
    {
        boolean four = year%400 ==0;
        boolean hundred = year%100 ==0;
        if (year%4==0 && (four && hundred)){
            return true;
        }
        else {
            return false;
        }
    }





//    public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
//    {
//
//
//    }
}
