package BookProblemSets.LinkedLists.ProblemSets2;

import java.util.ArrayList;

public class SumLists {

    public static void main(String[] args)
    {
        // answer is 567
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(6);
        list2.add(4);
        list2.add(2);

        Node result = addLists(list1.getNode(0), list2.getNode(0));

        ArrayList<Integer> newList = new ArrayList<>();
        Node curr = result;

        while (curr != null)
        {
            newList.add(curr.val);
            curr = curr.next;
        }

        System.out.println(newList);

    }

    public static Node addLists(Node node1, Node node2)
    {
        return addLists(node1, node2, 0);
    }

    public static Node addLists(Node node1, Node node2, int carry)
    {
        // base case
        if (node1 == null && node2 == null && carry == 0)
        {
            return null;
        }

        Node result = new Node();

        int val = carry;

        // Add the digits
        if (node1 != null)
        {
            val += node1.val;
        }
        if (node2 != null)
        {
            val += node2.val;
        }

        // calculate digit, i.e. 9+9 = 18 -> 8
        result.val = val % 10;

        // recurse
        if (node1 != null || node2 != null)
        {
            Node more = addLists(node1 == null ? null : node1.next,
                                node2 == null ? null : node2.next,
                                val >= 10 ? 1 : 0);

            result.setNext(more);
        }
        return result;
    }

}
