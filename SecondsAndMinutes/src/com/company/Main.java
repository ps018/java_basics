package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(100,20));
        System.out.println(getDurationString(10000));
    }
    private static String getDurationString(long minutes, long seconds)
    {
        if(minutes<0 || seconds<0 || seconds>59)
        {
            return "Invalid Value";
        }

        long hour = minutes/60;
        long remainingMinutes = minutes%60;
        String Hour = hour + "h ";
        if((hour<10))
        {
            Hour = "0" + hour + "h ";
        }

       String Minutes = remainingMinutes + "m ";
        if(minutes<10)
        {
            Minutes = "0" + remainingMinutes + "m ";
        }

        String Seconds = seconds + "s ";
        if(seconds<10)
        {
            Seconds = "0" + seconds + "s ";
        }

        return Hour + Minutes + Seconds;
    }
    private static String getDurationString(long seconds)
    {
        if(seconds<0)
        {
            return "Invalid Value";
        }
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
