package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "I am Priya";
        System.out.println("myString = " + myString);
        myString = myString + ", my husband is Ankit.";
        System.out.println("myString = " + myString);
        myString = myString + "\u00A9 2021";
        System.out.println("myString = " + myString);
        String no = "250.55";
        no = no + " 49.45";
        System.out.println("Number String = " + no);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString );

    }
}
