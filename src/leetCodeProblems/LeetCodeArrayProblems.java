package leetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeArrayProblems {
    public static void main(String[] args) {

        int[] duplicateNums = {1, 2, 3, 1};
        String haystack = "abc", needle = "c";
        System.out.println("Contains Duplicate " + strStr(haystack, needle));
    }

    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    //Input: nums = [1,2,3,1]
    //Output: true
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    //Input: haystack = "sadbutsad", needle = "sad"
    //Output: 0
    //Explanation: "sad" occurs at index 0 and 6.
    //The first occurrence is at index 0, so we return 0.
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 1) {
            if (haystack.startsWith(needle)) return 0;
        }
        for (int i = 0; i <= haystack.length() - 1; i++) {
            if (i + needle.length() <= haystack.length()) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
            }
        }
        return -1;

    }

}