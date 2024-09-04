package OnlinePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SeveralMethodsForArraysCollectionsQueuesList {

    public static void main(String[] args) {
        // Initialize a list
        List<Integer> myList = new ArrayList<>();
        Collections.addAll(myList, 1, 2, 3, 2);

        // Demonstrate `add` (equivalent to `append`)
        System.out.println("Original list: " + myList);
        myList.add(4);
        System.out.println("After adding 4: " + myList);

        // Demonstrate `addAll`
        myList.addAll(List.of(5, 6));
        System.out.println("After adding [5, 6]: " + myList);

        // Demonstrate `add(index, element)`
        myList.add(2, 7);
        System.out.println("After inserting 7 at index 2: " + myList);

        // Demonstrate `remove(Object)`
        myList.remove(Integer.valueOf(7));
        System.out.println("After removing 7: " + myList);

        // Demonstrate `remove(index)`
        Integer removedItem = myList.remove(myList.size() - 1);
        System.out.println("Item removed from the end: " + removedItem);
        System.out.println("After removing the last item: " + myList);

        // Demonstrate `clear`
        myList.clear();
        System.out.println("After clearing the list: " + myList);

        // Reinitialize the list for further methods
        Collections.addAll(myList, 1, 2, 3, 2);

        // Demonstrate `indexOf`
        int index = myList.indexOf(2);
        System.out.println("Index of first occurrence of 2: " + index);

        // Demonstrate `frequency`
        int count = Collections.frequency(myList, 2);
        System.out.println("Count of occurrences of 2: " + count);

        // Demonstrate `sort`
        Collections.sort(myList);
        System.out.println("After sorting: " + myList);

        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("After sorting in reverse order: " + myList);

        // Demonstrate `reverse`
        Collections.reverse(myList);
        System.out.println("After reversing: " + myList);

        // Demonstrate `copy`
        List<Integer> myCopy = new ArrayList<>(myList);
        System.out.println("Copy of the list: " + myCopy);

        // Demonstrate heap operations using PriorityQueue
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(10);
        heap.add(5);
        heap.add(15);
        heap.add(7);
        heap.add(3);

        System.out.println("Heap after adding elements: " + heap);

        Integer minElement = heap.poll();
        System.out.println("Extracted min element from heap: " + minElement);
        System.out.println("Heap after extracting min element: " + heap);

        System.out.println("Current min element in heap (peek): " + heap.peek());

        // Adjacency Matrix Representation (Unweighted)
        int[][] matrix = {
                {0, 1, 1, 0},  // Connections for vertex 'A'
                {1, 0, 0, 1},  // Connections for vertex 'B'
                {1, 0, 0, 1},  // Connections for vertex 'C'
                {0, 1, 1, 0}   // Connections for vertex 'D'
        };

        System.out.println("Adjacency Matrix (Unweighted):");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Adjacency Matrix for Weighted Graph
        int[][] weightedMatrix = {
                {0, 1, 3, 0},  // Weights from vertex 'A'
                {1, 0, 0, 2},  // Weights from vertex 'B'
                {3, 0, 0, 1},  // Weights from vertex 'C'
                {0, 2, 1, 0}   // Weights from vertex 'D'
        };

        System.out.println("Adjacency Matrix (Weighted):");
        for (int[] row : weightedMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}