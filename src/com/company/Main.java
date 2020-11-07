package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        conditional c1 = new conditional();
//        System.out.println("2000 " + c1.isLeapYear(2000));
//        System.out.println("2004 " + c1.isLeapYear(2004));
//        System.out.println("2003 " + c1.isLeapYear(2003));
//        System.out.println("2100 " + c1.isLeapYear(2100));


        // is later
        System.out.println("1/2/2010 is later than 1/2/2011 " + c1.isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + c1.isLater(1,2,2011, 1,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + c1.isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + c1.isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + c1.isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2010 " + c1.isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + c1.isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2011 " + c1.isLater(4,8,2010, 1,2,2011));
    }
}
