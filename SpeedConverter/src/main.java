public class main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.25);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.25);
    }
}
