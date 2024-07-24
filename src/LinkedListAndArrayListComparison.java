import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayListComparison {
    public static void main(String[] args)
    {
        // Arraylist seems to be the most flexible for most applications
        // Getting elements from an arraylist is much faster
        // however, if you are removing and adding elements, linked list maybe better


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        //populate lists
        for (int i = 0; i < 1000000; i++)
        {
            linkedList.add(i);
            arrayList.add(i);
        }

        // *********** LinkedList
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);\
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: " + elapsedTime + " nanoseconds");

        // *********** ArrayList
        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: " + elapsedTime + " nanoseconds");
    }
}
