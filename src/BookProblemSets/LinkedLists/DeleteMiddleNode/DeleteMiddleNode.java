package BookProblemSets.LinkedLists.DeleteMiddleNode;

public class DeleteMiddleNode {
    public static void main (String[] args)
    {
        // declare the nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        deleteMiddleNode(node3);

        while (node1 != null)
        {
            System.out.println(node1.data + " ");
            node1 = node1.next;
        }
    }

    public static boolean deleteMiddleNode(Node node)
    {
        // You can't delete head or if there is no other next node at the end
        if (node == null || node.next == null)
        {
            return false;
        }

        node.data = node.next.data;
        node.next = node.next.next;

        return true;
    }
}
