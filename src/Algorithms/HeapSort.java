package Algorithms;

public class HeapSort {

    // Driver code to test the implementation
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        printArray(array);

        heapSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Main function to perform Heap Sort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // Function to heapify a subtree rooted at index i
    // n is the size of the heap
    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child index
        int right = 2 * i + 2; // right child index

        // If the left child is larger than the root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If the largest is not root
        if (largest != i) {
            // Swap the root with the largest
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }

    // Utility function to print the array
    private static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
