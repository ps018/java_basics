package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            count++;
            System.out.println("Even Number = " + number);
            if(count==5)
            {
                break;
            }
        }
    }
    public static boolean isEvenNumber(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
}
