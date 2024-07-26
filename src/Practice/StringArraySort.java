package Practice;
import java.util.ArrayList;
import java.util.Collections;

public class StringArraySort {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("zoo");
        arr.add("boy");
        arr.add("maryland");
        arr.add("tell");
        arr.add("manic");

        Collections.sort(arr);

        System.out.println(arr);
    }
}
