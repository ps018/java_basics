public class FactorPrinter {
    public static final String INVALID="Invalid Value";
    public static void printFactors(int number) {
        if (number < 1)
            System.out.println(INVALID);
        else {
            int factor;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    factor = i;
                    System.out.println(factor);
                }
            }
            factor = number;
            System.out.println(factor);
        }
    }
}
