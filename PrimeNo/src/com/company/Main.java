package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
	    for(int i=75; i<=100; i++)
	    {
                if (isPrime(i)) {
                    count++;
                    System.out.println(i + " is Prime.");
                    if(count==3)
                    {
                        System.out.println("Exiting FOR Loop");
                        break;
                    }
                }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }

        for(int i=2; i<=n/2; i++)   //7/2=3; i<=3; 7%2=1; 7%3=1
        {                           //i<= (long) Math.sqrt(n) for less loops
            if(n%i==0)
                return false;

        }

        return true;
    }
}
