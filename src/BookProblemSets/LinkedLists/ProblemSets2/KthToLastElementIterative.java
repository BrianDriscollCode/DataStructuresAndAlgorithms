package BookProblemSets.LinkedLists.ProblemSets2;

public class KthToLastElementIterative {
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


        System.out.println(KthToLast(list.head, 2).val);
    }

    public static Node KthToLast(Node head, int k)
    {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k; i++)
        {
            if (p2 == null)
            {
                return null;
            }

            p2 = p2.next;
        }

        while (p2 != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}
