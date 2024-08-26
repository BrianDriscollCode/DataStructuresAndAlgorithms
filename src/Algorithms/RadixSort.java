package Algorithms;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));

        radixSort(array);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }

    // The main function that sorts the given array using Radix Sort
    public static void radixSort(int[] array) {
        // Find the maximum number to know the number of digits
        int max = getMax(array);

        // Perform counting sort for every digit
        for (int i = 1; max / i > 0; i *= 10) {
            countingSort(array, i);
        }
    }

    // Function to perform counting sort based on the digit represented by exp
    private static void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n]; // output array to store sorted values
        int[] count = new int[10]; // array to store the count of occurrences

        // Initialize count array with all zeros
        Arrays.fill(count, 0);

        // Store the count of occurrences of each digit
        for (int i = 0; i < n; i++) {
            int index = (array[i] / exp) % 10;
            count[index]++;
        }

        // Change count[i] to contain the actual position of the digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        // Copy the output array to array[], so that array[] now contains sorted numbers
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    // Function to get the maximum value in the array
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
