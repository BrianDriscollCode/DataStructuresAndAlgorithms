package OnlinePractice;

//Anagrams are strings that contain the same exact letters,

public class ValidAnagram {
    public static void main(String[] args)
    {
        String test_1_a = "test";
        String test_1_b = "tset";

        String test_2_a = "testa";
        String test_2_b = "tset";

        String test_3_a = "utility";
        String test_3_b = "ytilitu";

        String test_4_a = "utility";
        String test_4_b = "ytilitp";

        System.out.println(isAnagram(test_1_a, test_1_b));
        System.out.println(isAnagram(test_2_a, test_2_b));
        System.out.println(isAnagram(test_3_a, test_3_b));
        System.out.println(isAnagram(test_4_a, test_4_b));


    }

    public static boolean isAnagram(String firstString, String secondString)
    {
        if (firstString.length() != secondString.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < firstString.length(); i++)
        {
            store[firstString.charAt(i) - 'a']++;
            store[secondString.charAt(i) - 'a']--;
        }

        for (int i = 0; i < store.length; i++)
        {
            if (store[i] != 0) return false;
        }

        return true;
    }
}
