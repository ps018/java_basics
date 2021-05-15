public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int num = number;
        while(number!=0)
        {                                       // number = 456; 45; 4
            int lastDigit = number % 10;        // last digit = 6; 5; 4
            reverse *= 10;                      // reverse = 0 * 10 = 0; 60; 650
            reverse += lastDigit;               // reverse = 6; 65; 654
            number /= 10;                       // number = 456 / 10 = 45; 4; 0
        }
        if(num==reverse)
        {
            return true;
        }
        return false;
    }
}
