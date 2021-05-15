import java.util.Scanner;

import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int number)
    {
        Scanner scanner = new Scanner(System.in);
        int[] myIntegers = new int[number];
        System.out.println("Enter " + number + " integer values:\r");
        for(int i=0; i<myIntegers.length;i++)
        {
            myIntegers[i] = scanner.nextInt();
        }

        return myIntegers;
    }

    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array)
    {
        //int[] sortedArray = Arrays.copyOf(array,array.length); // creates copy of array
        boolean flag = true;
        while (flag)
        {
            flag = false;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1]) {
                    int sortedArray = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = sortedArray;
                    flag = true;
                }
            }
        }
        return array;
    }
}

