package BookProblemSets.LinkedLists.ProblemSets2;

import java.util.HashSet;

public class DeleteDupsWithBookRef {
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

        HashSet<Integer> set = new HashSet<>();
        LinkedList newList = new LinkedList();

        Node curr = list.head.next;

        while (curr != null)
        {
            if (!set.contains(curr.val))
            {
                newList.add(curr.val);
                set.add(curr.val);
            }
            curr = curr.next;
        }

        list = newList;
        list.printList();
    }
}
