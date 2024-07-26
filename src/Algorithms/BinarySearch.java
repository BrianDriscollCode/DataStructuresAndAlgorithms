package Algorithms;
import java.util.Arrays;

public class BinarySearch {
    //      Binary search - finds the position of a target value within a sorted array
    //
    //                      Half the array is eliminated during each step

    //      Advantage: Good for large datasets
    //      Disadvantage: slower for small datasets

    //      Runtime complexity: 0(log n)

    public static void main(String[] args) {
        int array[] = new int[1000000];
        int target = 762899;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target); //use builtin java method
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length -1;

        while(low <= high)
        {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) // ex: array is 1000 positions, value is 500, target is 750, set low to 500
            {
                low = middle + 1;
            }
            else if (value > target) // ex: array is 1000 positions, value is 500, target is 750, set high to 500
            {
                high = middle - 1;
            }
            else return middle; // target is found
        }

        return -1; // target not found
    }
}
