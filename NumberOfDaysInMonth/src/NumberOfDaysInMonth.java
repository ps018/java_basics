public class NumberOfDaysInMonth {
    public static final int INVALID_VALUE = -1;
    public static boolean isLeapYear(int year)
    {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 400 == 0 && year%100==0) {
               return true;
                }else if(year%4==0 && year%100!=0)
                return true;
            }
        return false;
    }
    public static int getDaysInMonth(int month, int year)
    {
        if(month<1 || month>12)
            return INVALID_VALUE;

        if(year<1 || year>9999)
            return INVALID_VALUE;

        int days;
        if(isLeapYear(year))
        {
            switch (month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    days = 29;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                default:
                    return INVALID_VALUE;
            }
        }
        else
        {
            switch (month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
                case 2:
                    days = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                default:
                    return INVALID_VALUE;
            }
        }
        return days;
    }
}


