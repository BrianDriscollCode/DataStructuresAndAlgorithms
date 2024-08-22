package DataStructures;

import java.util.*;

public class HashTableDS {

    public static void main(String[] args)
    {
        // Hashtable =  A data structure that stores unique keys to values i.e. <Integer, String>
        //              Key/value pair is an entry

        // Advantage: fast insertion, look up, deletion of key/value pairs, good for big data sets
        // Disadvantage: not ideal for small data sets

        // hashing =    takes a key and computes integer
        //              (hash % capacity) to calculate an index numbers
        //              key.hashcode() % capacity = index

        // bucket = an indexed storage location for one or more entries
        //          can store multiple entries make entries in bucket a linkedlist

        // collisions = has function generates same index for more than one key
        //              less collisions = more efficient

        // Runtime complexity = Best Case 0(1)
        //                       Worst Case 0(n)


        // has init capacity of 11 and load factor of 0.75 (expands at 75%)
        // we chance capacity to 10
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //table.remove(777);

        for (Integer key: table.keySet())
        {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }



    }

}
