package com.company;

public class conditional {

    public boolean isLeapYear(int year) {
        boolean years = year % 4 == 0;
        boolean fourH = year % 400 == 0;
        boolean hundred = year % 100 == 0;
        if (!years) {
            return false;
        } else if (!fourH && hundred) {
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


    public String bestMatch(int r, int g, int b){
        boolean red = r>=g && r>=b;
        boolean green = g>=r && g>=b;

        if (red){
            if (r>g && r>b){
                return "RED";
            }
            else if (r==g && r==b){
                return "GRAY";
            }
            else if (r==g){
                return "YELLOW";
            }
            else {
                return "MAGENTA";
            }
        }
        else if (green) {
            if (g > b) {
                return "GREEN";
            }
            else {
                return "CYAN";
            }
        }
        else {
            return "BLUE";
        }
    }

    public int findBestFit(int size1, int size2, int space){
        boolean both = size1 + size2 <= space;
        boolean first = size1 + size2 >= space;
        int x = 0;

        if (both){
            x=3;
        }
        else if (first){
            if (size1>size2 && size1<space || size1==size2 && size1<space || size1<space && size2>space){
                x = 1;
            }
            else if (size2>size1 && size2<space || size2<space && size1>space){
                x = 2;
            }
            else {
                x = 0;
            }
        }
        return x;
    }


    public boolean makeBench(int small, int big, int goal){
        big *= 5;
        int total = small + big;

        if(total>=goal){
            return true;
        }
        else{
            return false;
        }
    }


}
