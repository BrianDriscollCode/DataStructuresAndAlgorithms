package BookProblemSets.LinkedLists.ReturnKthToLast;

import java.util.LinkedList;

public class ReturnKthToLastTwoPointer
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println(getKthToLast(list, 3));
    }

    public static int getKthToLast(LinkedList<Integer> list, int kthToLast)
    {
        int firstPointer = 0;
        int secondPointer = 0;

        for (int i = 0; i < kthToLast; i++)
        {
            // set up pointer spacing
            if (secondPointer >= list.size())
            {
                System.out.println("List is smaller than kthToLastInt");
                return -1;
            }
            secondPointer++;
        }

        while (secondPointer < list.size())
        {
            // Move pointers to ending positions
            firstPointer++;
            secondPointer++;
        }

        return list.get(firstPointer);
    }
}
