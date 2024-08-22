package DataStructures;

public class DynamicArrayDS {
    public static void main(String[] args)
    {
        // Also known as:
        // Java = ArrayList
        // C++ = Vector
        // JavaScript = Array
        // Python = List

        // When adding element in beginning, all proceeding must be moved up
        // Static array = fixed size
        // Dynamic array = once reaches capacity
        // Increase capacity: new String[capacity * 2] (i.e. size from 5 to 10)

        // Advantages:
        // 1. Random access of elements  0(1) (i.e. array[index])
        // 2. Good locality of reference and data cache utilization
        // 2a. Memory is contiguous (in order)
        // 3. Easy to insert/delete data at the end

        // Disadvantage:
        // 1. Wastes memory (adjusts more room)
        // 2. Shifting element is time-consuming 0(n)
        // 3. Expanding/shinking the array is time-consuming 0(n)
        // 3a. when expanding, must copy all elements to new array

        //ArrayList<String> arraylist = new ArrayList<String>(); // prebuilt dynamic array

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println("***************************");
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());

    }
}
