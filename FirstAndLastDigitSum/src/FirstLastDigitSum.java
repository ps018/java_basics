public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
        {
            return -1;
        }

        int sum = 0;
        int lastDigit = 0;
        int FirstDigit = 0;
        lastDigit = number % 10;
        while (number>0)
        {
            FirstDigit = number;
            number /= 10;
        }
        sum = FirstDigit + lastDigit;
        return sum;
    }
}
