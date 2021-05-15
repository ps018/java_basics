import java.util.Scanner;

public class MinimumElement {

    private static int readInteger()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int integer = scanner.nextInt();
        return integer;
    }

    private static int[] readElements(int count)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Enter the integers: ");
        for (int i=0; i<count; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array)
    {

        int min = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++)
        {
            int value = array[i];
            if(value<min)
            {
                min = value;
            }
        }
        return min;
    }
}
