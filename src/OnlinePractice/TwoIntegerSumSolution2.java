package OnlinePractice;
import java.util.Map;
import java.util.HashMap;

public class TwoIntegerSumSolution2 {
    public static void main(String[] args)
    {
        int[] result1 = twoSum(new int[]{1, 3, 5, 6}, 7);
        int[] result2 = twoSum(new int[]{0, 1, 6, 9}, 7);

        for (int i = 0; i < result1.length; i++)
        {
            System.out.print(result1[i]);
        }

        System.out.println("");

        for (int i = 0; i < result1.length; i++)
        {
            System.out.print(result2[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> compareMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            Integer index = compareMap.get(nums[i]);

            if (index != null)
            {
                return new int[]{index, i};
            }

            compareMap.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
