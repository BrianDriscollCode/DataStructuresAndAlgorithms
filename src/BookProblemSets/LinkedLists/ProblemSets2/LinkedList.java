package BookProblemSets.LinkedLists.ProblemSets2;

import BookProblemSets.LinkedLists.ProblemSets1.Partition.Partition;

import java.util.ArrayList;

class Node
{
    int val;
    Node next;

    Node()
    {
        this.val = 0;
        this.next= null;
    }

    Node(int val)
    {
        this.val = val;
        this.next = null;
    }

    public void setNext(Node nextNode)
    {
        this.next = nextNode;
    }
}

public class LinkedList {
    Node head;
    Node tail;
    int length = 0;

    LinkedList()
    {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public void add(int val)
    {
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
        length++;
    }

    public int get(int val)
    {
        Node curr = this.head.next;
        int iterator = 0;

        while (curr != null)
        {
            if (iterator == val)
            {
                return curr.val;
            }
            curr = curr.next;
            iterator++;
        }

        return -1;
    }

    public Node getNode(int pos)
    {
        Node curr = this.head.next;
        int iterator = 0;
        while (curr != null)
        {
            if (iterator == pos)
            {
                return curr;
            }

            curr = curr.next;
            iterator++;
        }

        return null;
    }

    public void printList()
    {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = this.head.next;

        while (curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }

        System.out.println(list);
    }
}
