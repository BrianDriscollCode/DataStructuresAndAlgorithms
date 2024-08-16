package Algorithms;

public class SelectionSort {

    public static void main(String[] args)
    {
        // Selection sort - search through array and keep track of minimum value during each iteration.
        //                  at end of each iteration, swap variables.
        //
        // runtime of O(n^2) = quadratic time (insertion and bubble sort the same)
        //
        // **

        int array[] = {8, 7, 9 , 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i : array)
        {
            System.out.print(i);
        }
    }

    public static void selectionSort(int[] array)
    {

        // start looping through array
        for (int i = 0; i < array.length - 1; i++)
        {
            // set init minimum
            int min = i;

            // start looping through array at 1 position after start from previous loop
            for (int j = i + 1; j < array.length; j++)
            {

                // replace min position if another smaller number is found
                if (array[min] > array[j])
                {
                    min = j;
                }
            }

            // store position value
            int temp = array[i];
            // insert min value into current i position
            array[i] = array[min];
            // replace the min position with the value we stored
            array[min] = temp;

            // [ 5, 3, 6, 10 ]
            //Visual -> [min] [store]
            //Once first iteration done -> [3] [store]
            //store process -> [3] [5]
            //Insert min -> [3, 3, 5, 10 ]
            //Insert store -> [3, 5, 6, 10]
        }
    }



}
