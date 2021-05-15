package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;       // set to max number so that min value cannot be zero
        int max = Integer.MIN_VALUE;
   //     boolean first = true;

        while(true)
        {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                int number = scanner.nextInt();
//                if(first)               //so that min value could not be zero.
//                {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number>max){
                    max = number;
                }

                if(number<min){
                    min = number;
                }
            }else
            {
                break;
            }
            scanner.nextLine(); //enter key
        }
        System.out.println("Min= " + min + ", Max = " + max);
        scanner.close();
    }
}
