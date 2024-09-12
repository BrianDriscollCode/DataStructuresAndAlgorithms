package BookProblemSets.LinkedLists.ProblemSets2;

public class KthToLastElement {
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

        Node curr = list.head.next;
        int k = 2;
        int counter = 0;

        while (curr != null)
        {
            if (counter == list.length - k)
            {
                System.out.println(list.get(counter));
            }
            counter++;
            curr = curr.next;
        }


    }
}
