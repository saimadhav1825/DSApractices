package dsalearn.array.leetcodearraryproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));

    }

    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }

    //https://leetcode.com/problems/shuffle-the-array/1470
    //nums = [2,5,1,3,4,7], n = 3
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n * 2];
        for (int i = 0, j = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }
        return ans;

    }

    //https://leetcode.com/problems/number-of-employees-who-met-the-target/description/2798
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) count++;
        }
        return count;
    }

    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/1431
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int highest = 0;
        for (int i = 0; i < candies.length; i++) {
            int value = candies[i] + extraCandies;
            if (highest < value) {
                highest = value;
                ans.add(true);
            } else ans.add(false);
        }
        return ans;
    }
}
