package BookProblemSets.LinkedLists.ProblemSets1.RemoveDuplicates;

import java.util.LinkedList;
import java.util.HashSet;

// Uses Hashset to do comparison with access via 'contains' being 0(n)
// then if there is no value contained, add to new list, replace current
// list with new list

public class RemoveDuplicatesHashTable {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(6);

        HashSet<Integer> compareSet = new HashSet<>();
        LinkedList<Integer> newList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++)
        {
            int val = list.get(i);

            if (!compareSet.contains(val))
            {
                compareSet.add(val);
                newList.add(val);
            }
        }

        list = newList;
        System.out.println(list);
    }

}
