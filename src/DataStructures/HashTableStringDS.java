package DataStructures;

import java.util.*;

public class HashTableStringDS {

    public static void main(String[] args)
    {

        // has init capacity of 11 and load factor of 0.75 (expands at 75%)
        // we chance capacity to 10
        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);

        //increase capacity to avoid collisions
        for (String key: table.keySet())
        {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));
        }

    }

}
