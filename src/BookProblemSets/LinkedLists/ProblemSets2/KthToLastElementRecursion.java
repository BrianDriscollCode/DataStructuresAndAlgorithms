package BookProblemSets.LinkedLists.ProblemSets2;

public class KthToLastElementRecursion {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);

        printKthToLast(list.head, 2);
    }

    public static int printKthToLast(Node head, int k)
    {
        if (head == null)
        {
            return 0;
        }

        int index = printKthToLast(head.next, k) + 1;

        if (index == k)
        {
            System.out.println(k + "th to last node is " + head.val);
        }
        return index;
    }
}
