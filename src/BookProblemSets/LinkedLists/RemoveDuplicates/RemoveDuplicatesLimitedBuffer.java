package BookProblemSets.LinkedLists.RemoveDuplicates;

// With a limited buffer, the limiting factor is size. Therefore, time complexity is higher
// by using 2 points which uses 2 for loops making time to be O(n^2)

import java.util.LinkedList;

public class RemoveDuplicatesLimitedBuffer {

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


        System.out.println(list);

        removeDuplicates(list);
        System.out.println(list);
    }

    static public void removeDuplicates(LinkedList<Integer> list)
    {

        for (int i = 0; i < list.size(); i++) {
            int iVal = list.get(i);

            for (int n = i + 1; n < list.size(); n++) {
                int nVal = list.get(n);
                if (nVal == iVal) {
                    list.remove(n);
                }
            }
        }

    }

}
