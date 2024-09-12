package BookProblemSets.LinkedLists.ProblemSets2;

import java.util.HashSet;

public class DeleteDupsManual {
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

        int counter = 0;
        while (list.get(counter) != -1)
        {
            int currVal = list.get(counter);

           if (!set.contains(currVal))
           {
               newList.add(currVal);
           }
           set.add(currVal);
           counter++;
        }

        list = newList;

        list.printList();
    }


}
