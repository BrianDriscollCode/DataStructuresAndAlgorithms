package Practice;

public class TwoIntegerSumSolution1 {

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

    private static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }

        return new int[]{};
    }

}
