package BookProblemSets.LinkedLists.ProblemSets2;

import java.util.ArrayList;

public class PartitionNonStable {
    public static void main(String[] args)
    {
        // Partition 5
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        //list.printList();
        Node result = partition(list.getNode(0), 5);

        // print result
        Node curr = result;
        ArrayList<Integer> newList = new ArrayList<>();

        while (curr != null)
        {
            newList.add(curr.val);
            curr = curr.next;
        }

        System.out.println(newList);
    }

    public static Node partition(Node node, int x)
    {
        Node head = node;
        Node tail = node;

        while (node != null)
        {
            Node next = node.next;

            if (node.val < x)
            {
                node.next = head;
                head = node;
            }
            else
            {
                tail.next = node;
                tail = node;
            }

            node = next;
        }

        tail.next = null;
        return head;
    }
}
