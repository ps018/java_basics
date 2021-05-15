public class SumOddRange {
    public static final int INVALID_INPUT = -1;

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
            return false;
        }
        return false;
    }
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(end>=start && start>0 && end>0) {
            for (int i = start; i <= end; i++)
            {
                if(isOdd(i))
                {
                    sum+=i;
                }
            }
        }else {
            return INVALID_INPUT;
        }
        return sum;
    }
}
