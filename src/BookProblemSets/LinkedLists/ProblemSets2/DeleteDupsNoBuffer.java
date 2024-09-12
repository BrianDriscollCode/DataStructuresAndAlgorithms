package BookProblemSets.LinkedLists.ProblemSets2;

public class DeleteDupsNoBuffer {
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

        list.printList();

        Node curr = list.head.next;

        while (curr != null)
        {
            Node runner = curr;

            while (runner.next != null)
            {
                if (runner.next.val == curr.val)
                {
                    runner.next = runner.next.next; // move next link to next next to take node out of list
                }
                else
                {
                    runner = runner.next;
                }
            }

            curr = curr.next;
        }

        list.printList();
    }


}
