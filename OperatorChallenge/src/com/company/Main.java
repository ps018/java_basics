package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 20d;
        System.out.println("First value = " + a);
	double b = 80d;
        System.out.println("Second value = " + b);
	double c = (a + b)* 100d;
        System.out.println("Total of values = " + c);
	double d = c % 40d;
        System.out.println("Remainder = " + d);
	boolean e = d == 0;
        System.out.println("The boolean variable is : " + e);
        if(!e) {
            System.out.println("Got some remainder");
        }

    }
}
