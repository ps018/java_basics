public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first<10 || second<10)
            return -1;

        int greatestCommonDivisor = 1;
        int min = second;
        if(first<second)
        {
            min = first;
        }

        for(int i = min; i>1; i--)
        {
            if(first%i==0 && second%i==0)
            {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }
}
