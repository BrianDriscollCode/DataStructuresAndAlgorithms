
package BookProblemSets.LinkedLists.ProblemSets1.DeleteMiddleNode;

public class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

/*
public class Node {
    Node next = null;
    int data;

    public Node(int d)
    {
        data = d;
    }

    void appendToTail(int d)
    {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null)
        {
            n = n.next;
        }
        n.next = end;
    }

    Node DeleteNode(Node head, int d)
    {
        if (head == null) return null;
        Node n = head;

        if (n.data == d)
        {
            return head.next;
        }

        while (n.next != null)
        {
            if (n.next.data == d)
            {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }
}
*/
