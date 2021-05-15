import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static void reverse(int[] array)
    {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for (int i=0; i<halfLength; i++)    //swapping first and last element
        {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter array of numbers to be reversed: ");
        for(int i=0; i<array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        reverse(array);
    }
}


