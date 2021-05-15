import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while(true)
        {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                count++;
                int number = scanner.nextInt();
                sum += number;
            }
            else
            {
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}
