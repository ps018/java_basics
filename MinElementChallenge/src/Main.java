import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count)
    {
        int[] array = new int[count];
        for(int i=0; i<count; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++)
        {
            int value = array[i];

            if(value<min)
            {
                min = value;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the integers: ");
        int[] array = readIntegers(count);
        System.out.println("Min = " + findMin(array));

    }
}
