package dsalearn.binarysearch;

import java.util.Arrays;

public class BinarySearchExamples {
    public static void main(String[] args) {

        int[] arr = {5, 7, 8, 10, 11, 12};

        System.out.println(findElementInInfiniteArray(arr, 8));

    }

    //simple binary search
    private static int binarySearch(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //order diagnostics binary search
    private static int orderDiagnosticsBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] == target) return mid;
            if (isAsc) {
                if (target > arr[mid]) start = mid + 1;
                else if (target < arr[mid]) end = mid - 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else if (target < arr[mid]) start = mid + 1;
            }
        }
        return -1;
    }

    //Ceiling Number->the smallest element greater than or equal to target element
    public static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return start;

    }

    //Floor Number->the greatest  element less than or equal to target element
    public static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return end;
    }

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/34

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = searchElement(nums, target, true);
        int end = searchElement(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    private static int searchElement(int[] nums, int target, Boolean isFirstIndex) {
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    //find the target element in infinite array
    private static int findElementInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int number, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (number > arr[mid]) {
                start = mid + 1;
            } else if (number < arr[mid]) {
                end = mid - 1;
            } else return mid;
        }
        return -1;
    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/852
    //https://leetcode.com/problems/find-peak-element/description/162
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

}
