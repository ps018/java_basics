public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }

        double areaOfWall = width * height;
        double coveredAreaOfWall = areaOfWall/areaPerBucket;
        int bucketsToBuy = (int) Math.ceil(coveredAreaOfWall - extraBuckets);
        return bucketsToBuy;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        double areaOfWall = width * height;
        double coveredAreaOfWall = areaOfWall/areaPerBucket;
        int bucketsToBuy = (int) Math.ceil(coveredAreaOfWall);
        return bucketsToBuy;
    }
    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area<=0 || areaPerBucket<=0)
        {
            return -1;
        }

        double coveredAreaOfWall = area/areaPerBucket;
        int bucketsToBuy = (int) Math.ceil(coveredAreaOfWall);
        return bucketsToBuy;
    }
}
