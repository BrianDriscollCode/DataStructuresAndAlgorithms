package LinkedList;

import java.util.ArrayList;

public class LinkedListDS {
    private ListNode head;
    private ListNode tail;

    public LinkedListDS()
    {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index)
    {
        ListNode curr = this.head.next;
        int i = 0;

        while (curr != null)
        {
            if (i == index)
            {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val)
    {
        ListNode newNode = new ListNode(val);
        // dummy -> INSERT HERE -> firstNode
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (newNode.next == null)
        {
            this.tail = newNode;
        }
    }

    public void insertTail(int val)
    {
        ListNode newNode = new ListNode(val);
        this.tail.next = newNode;
        this.tail = this.tail.next;
    }

    public boolean remove(int index)
    {
        int i = 0;
        ListNode curr = this.head;

        while (curr != null && i < index)
        {
            i++;
            curr = curr.next;
        }

        if (curr != null && curr.next != null)
        {
            if (curr.next == this.tail)
            {
                this.tail = curr;
            }

            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues()
    {
        ArrayList<Integer> res = new ArrayList<>();

        ListNode curr = this.head.next;

        while (curr != null)
        {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
