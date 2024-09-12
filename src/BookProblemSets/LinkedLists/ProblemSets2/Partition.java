package BookProblemSets.LinkedLists.ProblemSets2;

public class Partition {
        public static void main(String[] args)
        {
            // Partition 5
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(5);
            list.add(8);
            list.add(5);
            list.add(10);
            list.add(2);
            list.add(1);

            list.printList();
            partition(list.getNode(0), 5);
            list.printList();

        }

        public static Node partition(Node node, int x)
        {
            Node headLess = null; // List for nodes less than x
            Node tailLess = null; // Tail for nodes less than x
            Node headGreater = null; // List for nodes greater than or equal to x
            Node tailGreater = null; // Tail for nodes greater than or equal to x

            while (node != null) {
                Node next = node.next;
                node.next = null; // Disconnect the current node from the list

                if (node.val < x) {
                    if (headLess == null) {
                        headLess = node;
                        tailLess = headLess;
                    } else {
                        tailLess.next = node;
                        tailLess = node;
                    }
                } else {
                    if (headGreater == null) {
                        headGreater = node;
                        tailGreater = headGreater;
                    } else {
                        tailGreater.next = node;
                        tailGreater = node;
                    }
                }
                node = next;
            }

            // If there are no nodes less than x, return the greater list
            if (headLess == null) {
                return headGreater;
            }

            // Connect the less-than list with the greater-or-equal list
            tailLess.next = headGreater;

            return headLess;
        }



}
