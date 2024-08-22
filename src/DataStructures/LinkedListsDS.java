package DataStructures;

import java.util.LinkedList;

public class LinkedListsDS
{
    public static void main(String[] args)
    {
        // Linked List = Non-contiguous list
        // Nodes stores in non-consecutive memory locations
        // Stores nodes in 2 parts (data + address)
        // Each piece of data had an address for the next piece of data.
        // Elements linked using pointers
        // When address is null, that is the end of the linked list

        //Time:
        // Searching is 0(n), linear
        // Insertion is 0(1), constant

        // Single Linked List
        //     node                node                node
        // [data | address] -> [data | address] -> [data | address]

        // Double Linked List
        //            node                            node
        // [address | data | address ] <-> [address | data | address]

        // Advantages:
        // 1. Dynamic Data Structure (allocate memory need when running)
        // 2. Insertion and deletion 0(1)
        // 3. No/low memory waste

        // Disadvantage:
        // 1. Greater memory usage (added pointer)
        // 2. No random access of elements (no index[i])
        // 3. Accessing and searching takes time 0(n)

        // Uses?
        // 1. Implement stack or queue
        // 2. GPS navigation
        // 3. music playlist

        LinkedList<String> linkedList = new LinkedList<String>();


        // Treating linked list like a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        // Order: [C, B, A]
        linkedList.pop();
        linkedList.pop();
        linkedList.pop();

        // Treating linked list like a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // Order: [A, B, C, D, F]
        //linkedList.poll();

        linkedList.add(4, "E"); // insert
        linkedList.remove("e"); // Search and remove
        //System.out.println(linkedList.indexOf("F")); // Get Position of element

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(first + " " + last);
        System.out.println(linkedList);


    }
}
