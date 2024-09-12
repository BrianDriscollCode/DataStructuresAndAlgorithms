package BookProblemSets.LinkedLists.ProblemSets2;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(3);

        boolean isPalindromeCheck = isPalindrome(list.getNode(3));
        System.out.println(isPalindromeCheck);
    }

    public static boolean isPalindrome(Node node)
    {
        Node curr = node;
        ArrayList<Integer> valueList = new ArrayList<>();

        while (node != null)
        {
            valueList.add(node.val);
            node = node.next;
        }

        int iterator = valueList.size() - 1;

        while (curr != null)
        {
            if (valueList.get(iterator) != curr.val)
            {
                System.out.println("value1: " + valueList.get(iterator));
                System.out.println("value2: " + curr.val);
                return false;
            }

            iterator--;
            curr = curr.next;
        }

        return true;
    }
}
