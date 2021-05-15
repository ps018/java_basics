public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2)
    {
        if(num1<10 || num1>99 || num2<10 || num2>99)
        {
            return false;
        }

            int digitInNum1, digitInNum2;
            digitInNum1 = num1 % 10;
            num1 /=10;
            digitInNum2 = num2 % 10;
            num2 /=10;
            if((digitInNum1==digitInNum2) || (digitInNum1==num2) || (num1==num2) || (num1==digitInNum2))
            {
                return true;
            }
            return false;
    }
}
