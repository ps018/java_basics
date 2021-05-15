public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            long day, year;
            day = minutes/1440;
            year = day/365;
            long remainingDays = day % 365;
            System.out.println(minutes + " min = " + year + " y and "
                    + remainingDays + " d");
        }
    }
}
