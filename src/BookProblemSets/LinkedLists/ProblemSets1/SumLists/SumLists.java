package BookProblemSets.LinkedLists.ProblemSets1.SumLists;

import java.util.ArrayList;

class LinkedList
{
    ListNode head;
    ListNode tail;

    LinkedList(ListNode head)
    {
        this.head = head;
        this.tail = this.head;
    }

    public void add(ListNode node)
    {
        this.tail.next = node;
        this.tail = this.tail.next;
    }

    public int get(int i)
    {
        ListNode curr = this.head;

        while (curr != null)
        {
            if (curr.val == i)
            {
                return curr.val;
            }

            curr = curr.next;
        }

        return -1;
    }

    public int size()
    {
        ListNode curr = this.head;
        int length = 0;

        while (curr != null)
        {
            length += 1;
            curr = curr.next;
        }

        return length;
    }

    public void printList()
    {
        ListNode curr = this.head;
        ArrayList<Integer> currList = new ArrayList<>();

        while (curr != null)
        {
            currList.add(curr.val);
            curr = curr.next;
        }

        System.out.println(currList);
    }
}

class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}

public class SumLists {
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList(new ListNode(9));
        list1.add(new ListNode(8));
        list1.add(new ListNode(1));

        LinkedList list2 = new LinkedList(new ListNode(2));
        list2.add(new ListNode(1));
        list2.add(new ListNode(9));


        list1.printList();
        list2.printList();
        addLinkedLists(list1, list2);

    }

    public static void addLinkedLists(LinkedList list1, LinkedList list2)
    {
        int[] multiplier = {1, 10, 100, 1000};
        //System.out.println(list1.size());
        //System.out.println(list2.get(1));

        int sum = 0;

        ArrayList<Integer> builder = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++)
        {
            int loopSum = 0;
            int position = list1.size() - i;

            int counter = 0;
            int list1Val = -1;
            ListNode curr = list1.head;
            while (counter != position)
            {
                list1Val = curr.val;
                curr = curr.next;
                counter += 1;
            }

            counter = 0;
            int list2Val = -1;
            curr = list2.head;
            while (counter != position)
            {
                list2Val = curr.val;
                curr = curr.next;
                counter += 1;
            }


            loopSum = (list1Val + list2Val) * multiplier[i];

            if (loopSum >= 10)
            {
                int digitOne = loopSum % 10;
                builder.add(digitOne);
            }
            else
            {
                builder.add(loopSum);
            }
            //System.out.println(list1Val + " + " + list2Val +  " = " +  loopSum);
        }

        System.out.println(builder);

        /*for (int i = 0; i < builder.size(); i++)
        {

        }*/
    }
}
