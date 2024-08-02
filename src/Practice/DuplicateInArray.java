package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2 ,3, 4};
        int[] arr2 = {1, 2, 2, 5};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 6};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(hasDuplicate(arr1));
        System.out.println(hasDuplicate(arr2));
        System.out.println(hasDuplicate(arr3));
        System.out.println(hasDuplicate(arr4));

    }

    public static boolean hasDuplicate(int[] nums)
    {
        Set<Integer> compareArray = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (compareArray.contains(nums[i]))
            {
                return true;
            }

            compareArray.add(nums[i]);
        }
        return false;
    }

}
