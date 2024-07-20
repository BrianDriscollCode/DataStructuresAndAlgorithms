import java.util.Queue;
import java.util.LinkedList;

public class QueuesDS
{
    public static void main(String[] args)
    {
        // Queue =  FIFO data structure. First-In First-Out (ex. A line of people)
        //          A collection designed for holding elements prior to processing
        //          Linear data structure

        //          add     = enqueue, offer()
        //          remove  = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //*****LinkedList (which implements queues) inherits these methods method from collections class
            //System.out.println(queue.isEmpty());
            //System.out.println(queue.size());
            //System.out.println(queue.contains("Harold"));
        //*****

        //System.out.println(queue.peek());
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.offer("Ryan");

        System.out.println(queue);

        // Where are queues useful?

        // 1. Keyboard buffer (letters should appear on the screen in the order they're passed)
        // 2. Printer queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
