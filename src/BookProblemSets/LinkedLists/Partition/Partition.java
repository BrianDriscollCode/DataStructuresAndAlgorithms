package BookProblemSets.LinkedLists.Partition;

import java.util.LinkedList;

public class Partition {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        System.out.println(partitionList(list, 5) + " - Partition is 5");
        System.out.println(partitionList(list, 2) + " - Partition is 2");
        System.out.println(partitionList(list, 1) + " - Partition is 1");
        System.out.println(partitionList(list, 10) + " - Partition is 10");
    }

    public static LinkedList<Integer> partitionList(LinkedList<Integer> list, int value) {
        LinkedList<Integer> lesserList = new LinkedList<>();
        LinkedList<Integer> greaterEqualList = new LinkedList<>();

        int partition = 0;
        boolean repeat = false;

        // Iterate through the list and separate into lesser and greater/equal lists
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value && !repeat)
            {
                partition = list.get(i);
            }
            else if (list.get(i) <= value)
            {
                lesserList.add(list.get(i));
            }
            else
            {
                greaterEqualList.add(list.get(i));  // Include equal or greater values
            }
        }

        // Combine the two lists: lesser values on the left, greater/equal values on the right
        lesserList.add(partition);
        lesserList.addAll(greaterEqualList);
        return lesserList;
    }


}
