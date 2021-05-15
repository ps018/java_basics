package com.company;

public class Main {

    public static void main(String[] args) {
	int myMinNo = Integer.MIN_VALUE;
	int myMaxNo = Integer.MAX_VALUE;
        System.out.println("Min value of Integer = " + myMinNo);
        System.out.println("Max value of Integer = " + myMaxNo);
        System.out.println("Busted min value of integer = " + (myMinNo - 1));
        System.out.println("Busted max value of integer = " + (myMaxNo + 1));

        byte myMinValue = Byte.MIN_VALUE;
        byte myMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinValue);
        System.out.println("Byte Maximum Value = " + myMaxValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 2147483648124L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("myLongValue = " + myLongValue);

        int myTotal = (myMinNo / 2);
        byte myNewByteValue = (byte) (myMinValue / 2); //Casting is used when we need a specific datatype other than default int
        System.out.println(myTotal);
        System.out.println(myNewByteValue);

        byte byteNo = 100;
        short shortNo = 300;
        int intNo = 500;
        long longNo = 50000L + 10L * (byteNo + shortNo + intNo);
        System.out.println(longNo);

    }
}
