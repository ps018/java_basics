public class LargestPrime {
    public static final int INVALID_INPUT = -1;
    public static int getLargestPrime(int number)
    {
        if(number<=1)
            return INVALID_INPUT;

        int factor= 1;
        int prime = 0;
       for(int i =2; i<=number; i++)//16; 8; 2
       {
           if(number%i ==0)//16%2=0; 8%4=0
           {
               factor = i;  //factor =2; 4
               number /= i; // number =16/2=8; 8/4=2
           }
       }
       prime = number;//prime = 2
       if (factor>prime)
       {
           for(int j=2; j<=Math.sqrt(factor); j++)
           {
               if(factor%j==0)
               {
                   return prime;
               }
           }
           return factor;//
       }
       return prime;
    }
}
