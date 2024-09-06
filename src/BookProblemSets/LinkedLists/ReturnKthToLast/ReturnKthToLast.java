package BookProblemSets.LinkedLists.ReturnKthToLast;

import java.util.LinkedList;

public class ReturnKthToLast
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println(getKthToLast(list, 2));
    }

    public static int getKthToLast(LinkedList<Integer> list, int kthToLastInt)
    {
        int value = 0;
        int counter = list.size();

        for (int i = 0; i < list.size(); i++)
        {
            if (counter == kthToLastInt)
            {
                value = list.get(i);
            }
            counter--;
        }

        return value;
    }

}
