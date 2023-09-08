package dsalearn;

import java.util.Arrays;
import java.util.HashMap;

public class LinearSearchProblems {
    public static void main(String[] args) {
        int[][] nums = {{2, -1, 10, 0, -20}, {2, 4, 5, 6, 78}};
        int[] arr = {12, 345, 2, 6, 7896, 1, 4};

        System.out.println("Sum Value "+maximumWealth(nums));
      //  System.out.println("Max num in the 2D array" + findEvenNumbersInTheArray(arr));
        // System.out.println("Minimum Num In the Array" + minimumNumInArray(nums));
        //System.out.println("If Item Found Or Not  Return Index  " + singleNonDuplicate(nums));
        //  System.out.println("Find Index of the Element in the 2D array" + Arrays.toString(searchElementIn2dArray(nums, 5)));
        //        System.out.println("Max num in the 2D array" + maxNumIn2dArray(nums));

    }

    //search in the array:if item found return index
    //if item not found return -1
    static int searchElementIndexIfContain(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return -1;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return index;
        return Integer.MAX_VALUE;
    }


    //search in the array:if item found return element
    //if item not found return -1
    static int searchElementIfFoundElement(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return -1;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return element;
        return Integer.MAX_VALUE;
    }

    //search in the array:if item found return true
    //if item not found return false
    static Boolean searchElementIfFoundReturnBoolean(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return false;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return true;
        return false;
    }

    //Search Item With In the Range from start and end index
    private static int searchItemWithInIndex(int[] arr, int item, int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = start; i <= end; i++) if (arr[i] == item) return i;
        return Integer.MAX_VALUE;
    }

    //find the minimum num in the arrau
    public static int minimumNumInArray(int[] arr) {
        int ans = arr[0];
        for (int num : arr) if (num < ans) ans = num;
        return ans;
    }

    //Search Element in 2d array

    private static int[] searchElementIn2dArray(int[][] arr, int target) {
        for (int row = 0; row <= arr.length - 1; row++) {
            for (int col = 0; col <= arr[row].length - 1; col++) {

                if (arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

    private static int maxNumIn2dArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <= arr.length - 1; row++) {
            for (int col = 0; col <= arr[row].length - 1; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static int findEvenNumbersInTheArray(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (eventDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean eventDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }


    //https://leetcode.com/problems/richest-customer-wealth/
    public static int maximumWealth(int[][] accounts) {
        int max =0;
        for (int row = 0; row <= accounts.length - 1; row++) {
            int sum = 0;
            for (int col = 0; col <= accounts[row].length - 1; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum >= max) {
                max = sum;
            }
        }
        return max;
    }
}
