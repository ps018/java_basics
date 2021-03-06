package com.company;

public class Main {

    public static void main(String[] args) {
	for(int i=8;i>1;i--) //for(init; termination; increment)
    {
        System.out.println("Interest of 10,000 at " + i
                + "% = " + String.format("%.2f",calculateInterest(10000.0,i)));
    }//%.2f keeps the decimal points to 2
    }
    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount *(interestRate/100));
    }
}
