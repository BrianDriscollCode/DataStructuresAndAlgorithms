package BookProblemSets.LinkedLists.ProblemSets2;



public class DeleteMiddleNode {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.printList();
        DeleteMiddle(list.getNode(2));
        list.printList();


    }

    public static void DeleteMiddle(Node node)
    {
        if (node == null)
        {
            return;
        }

        Node nextNode = node.next;
        node.val = nextNode.val;
        node.next = node.next.next;
    }

}
