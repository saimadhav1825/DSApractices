package dsalearn.linearSearch;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeProblems {

    public static void main(String[] args) {

        int[] arr={2,2,1};
        System.out.println("Singe Number "+singleNumber(arr));
    }

    //https://leetcode.com/problems/single-number/

    //Input {2,2,1}
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return set.iterator().next();
        }
        return -1;
    }
}
