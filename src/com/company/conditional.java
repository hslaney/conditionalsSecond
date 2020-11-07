package com.company;

public class conditional {

    public boolean isLeapYear(int year) {
        boolean years = year % 4 == 0;
        boolean four = year % 400 == 0;
        boolean hundred = year % 100 == 0;
        if (!years) {
            return false;
        } else if (!four && hundred) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        boolean checkMonth = month2 < month1;
        boolean checkYear = year2 < year1;
        boolean checkDay = day2 < day1;

        if (checkYear) {
            return true;
        }
        else if (year2==year1){
            if (checkMonth){
                return true;

            }
            else if (month2==month1){
                return checkDay;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }


}
