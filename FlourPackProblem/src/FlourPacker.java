public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {// bigcount = 5 kilo each, smallcount = 1 kilo each
        if(bigCount<0 || smallCount<0 || goal<0)// 0 , 5 , 4
        {
            return false;
        }

        bigCount *= 5;                          // bigcount = 0
        if(bigCount+smallCount <goal) {         // 0+5=5<4:false
            return false;
        }
        if(smallCount>=(goal%5))                // 5>=(4%5=4):true
        {
            return true;
        }
        return false;
    }
}
