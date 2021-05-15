public class AreaCalculator {
    public static final double INVALID_VALUE=-1;
    public static double area(double radius)
    {
        double areaOfCircle;
        if(radius<0)
        {
           return INVALID_VALUE;
        }
        else {
            areaOfCircle = radius * radius * Math.PI;
            return areaOfCircle;
        }
    }
    public static double area(double x, double y)
    {
        double areaOfRectangle;
        if(x<0 || y<0)
        {
            return INVALID_VALUE;
        }
        else {
            areaOfRectangle = x * y;
            return areaOfRectangle;
        }
    }

}
