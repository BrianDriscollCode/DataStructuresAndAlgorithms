package Algorithms;

public class BubbleSort {

    // Bubblesort = Compares 2 elements, then switches them if a > b
    //              The heavier elements fall as the lighter rise to the top
    //
    // Time complexity = Quadratic time 0(n^2)
    //
    //  Okay for small data sets
    //  bad for large data sets

    public static void main(String[] args)
    {
        int array[] = {9, 1, 8, 7, 3, 6, 4, 5, 2};

        bubbleSort(array);

        for (int i : array)
        {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[])
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
