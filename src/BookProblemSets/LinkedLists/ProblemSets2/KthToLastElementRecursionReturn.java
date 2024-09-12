package BookProblemSets.LinkedLists.ProblemSets2;

class Index
{
    public int value = 0;
}

public class KthToLastElementRecursionReturn {
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

        System.out.println(KthToLast(list.head, 3).val);
    }

    public static Node KthToLast(Node head, int k)
    {
        Index idx = new Index();
        return KthToLast(head, k, idx);
    }

    public static Node KthToLast(Node head, int k, Index idx)
    {
        if (head == null)
        {
            return null;
        }

        Node node = KthToLast(head.next, k, idx);

        idx.value += 1;
        if (idx.value == k)
        {
            return head;
        }
        return node;
    }
}
