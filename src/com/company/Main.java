package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        conditional c1 = new conditional();

        //isLeapYear
        System.out.println("2000 " + c1.isLeapYear(2000));
        System.out.println("2004 " + c1.isLeapYear(2004));
        System.out.println("2003 " + c1.isLeapYear(2003));
        System.out.println("2100 " + c1.isLeapYear(2100));
        System.out.println();

        // is later
        System.out.println("1/2/2010 is later than 1/2/2011 " + c1.isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + c1.isLater(1,2,2011, 1,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + c1.isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + c1.isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + c1.isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2010 " + c1.isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + c1.isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2011 " + c1.isLater(4,8,2010, 1,2,2011));
        System.out.println();

        //bestMatch
        System.out.println("Best match 2 3 4 " + c1.bestMatch(2,3,4));
        System.out.println("Best match 4 3 3 " + c1.bestMatch(4,3,3));
        System.out.println("Best match 3 8 4 " + c1.bestMatch(3,8,4));
        System.out.println("Best match 4 3 4 " + c1.bestMatch(4,3,4));
        System.out.println("Best match 2 4 4 " + c1.bestMatch(2,4,4));
        System.out.println("Best match 8 8 4 " + c1.bestMatch(8,8,4));
        System.out.println("Best match 4 4 8 " + c1.bestMatch(4,4,8));
        System.out.println();

        //findBestFit
        System.out.println("Find Best fit 2 3 6 is " + c1.findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + c1.findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + c1.findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + c1.findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + c1.findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + c1.findBestFit(3,6,4));
        System.out.println();

        //Make Bench
        System.out.println("Make bench 3 1 8 is " + c1.makeBench(3,1,8));
        System.out.println("Make bench 3 1 9 is " + c1.makeBench(3,1,9));
        System.out.println("Make bench 11 1 15 is " + c1.makeBench(11,1,15));
        System.out.println("Make bench 4 2 15 is " + c1.makeBench(4,2,15));
        System.out.println("Make bench 20 0 20 is " + c1.makeBench(20,0,20));
        System.out.println("Make bench 3 4 20 is " + c1.makeBench(3,4,20));
        System.out.println("Make bench 0 6 30 is " + c1.makeBench(0,6,30));
        System.out.println("Make bench 0 5 30 is " + c1.makeBench(0,5,30));
        System.out.println("Make bench 3 5 24 is " + c1.makeBench(3,5,24));
        System.out.println("Make bench 2 6 23 is " + c1.makeBench(2,6,23));

    }
}


/*

2000 true
2004 true
2003 false
2100 false

1/2/2010 is later than 1/2/2011 false
1/2/2011 is later than 1/2/2010 true
1/5/2010 is later than 3/2/2010 false
3/2/2010 is later than 1/2/2010 true
1/3/2010 is later than 1/2/2010 true
1/2/2010 is later than 1/3/2010 false
1/2/2010 is later than 1/2/2010 false
4/8/2010 is later than 1/2/2011 false

Best match 2 3 4 BLUE
Best match 4 3 3 RED
Best match 3 8 4 GREEN
Best match 4 3 4 MAGENTA
Best match 2 4 4 CYAN
Best match 8 8 4 YELLOW
Best match 4 4 8 BLUE

Find Best fit 2 3 6 is 3
Find Best fit 4 3 6 is 1
Find Best fit 3 4 6 is 2
Find Best fit 2 3 1 is 0
Find Best fit 6 3 4 is 2
Find Best fit 3 6 4 is 1

Make bench 3 1 8 is true
Make bench 3 1 9 is false
Make bench 11 1 15 is true
Make bench 4 2 15 is false
Make bench 20 0 20 is true
Make bench 3 4 20 is true
Make bench 0 6 30 is true
Make bench 0 5 30 is false
Make bench 3 5 24 is false
Make bench 2 6 23 is false

 */