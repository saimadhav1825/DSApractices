package dsalearn.cycleSortExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class CycleSortExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int swap = arr[i];
                arr[i] = arr[correct];
                arr[correct] = swap;
            } else i++;
        }
    }

    //https://leetcode.com/problems/missing-number/description/262
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int swap = arr[i];
                arr[i] = arr[correct];
                arr[correct] = swap;
            } else i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;

    }

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/448
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else i++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }

    //https://leetcode.com/problems/find-the-duplicate-number/287
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else return nums[i];
            } else i++;
        }
        return -1;
    }

    //https://leetcode.com/problems/find-all-duplicates-in-an-array/442
    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else i++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }
        return list;


    }
}
