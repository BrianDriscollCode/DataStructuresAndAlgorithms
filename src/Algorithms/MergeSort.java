package Algorithms;

public class MergeSort {
    public static void main(String[] args)
    {
        // divide and conquer algorithm, recursive algorithm
        // Runtime - 0(n log n) = quasilinear
        // Space - 0(n) - linear

        int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static void mergeSort(int[] arr)
    {
        int length = arr.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++)
        {
            if (i < middle)
            {
                leftArr[i] = arr[i];
            }
            else
            {
                rightArr[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr)
    {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize)
        {
            if (leftArr[l] < rightArr[r])
            {
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            else
            {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize)
        {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize)
        {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
