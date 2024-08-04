package LinkedList;


import java.util.ArrayList;

public class TestLinkedList {
    public static void main(String[] args)
    {
        LinkedListDS list = new LinkedListDS();

        list.insertHead(10);
        list.insertHead(20);
        list.insertTail(5);

        list.remove(1);

        ArrayList<Integer> listWithArrayType = list.getValues();

        for (int i = 0; i < listWithArrayType.size(); i++)
        {
            System.out.println(listWithArrayType.get(i));
        }


    }
}
