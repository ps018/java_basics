package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of 125 = " + sumDigits(125));
        System.out.println("The sum of 555 = " + sumDigits(555));
        System.out.println("The sum of -854 = " + sumDigits(-854));
        System.out.println("The sum of 2 = " + sumDigits(2));
        System.out.println("The sum of 0 = " + sumDigits(0));

    }
    public static int sumDigits(int number) //number=125
    {
        if(number<10)
        {
            return -1;
        }

        int sum = 0;
        while(number>0)
        {
            int digit = number % 10;
            sum += digit;
            number/=10;
        }
        return sum;
        /*if(number>=10)
        {
            int unitPlace = number%10;
            number/=10;
            int tensPlace = number%10;
            number/=10;
            int hundredsPlace = number%10;
            int sum = unitPlace+ tensPlace+ hundredsPlace;
            return sum;
        }
        else{
            return -1;
        }*/
    }
}
