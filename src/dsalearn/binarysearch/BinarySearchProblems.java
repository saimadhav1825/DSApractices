package dsalearn.binarysearch;

import java.util.Arrays;

public class BinarySearchProblems {
    public static void main(String[] args) {

        int[] ascArray = {-20, -5, -1, 0, 2, 3, 6, 7, 10, 11, 22, 25, 35, 67, 89};
        System.out.println("Find Element Index In Binary Search --" + findElementIndexInInfiniteArray(ascArray, 22));
    }

    //Sorted Array
    public static int findElementAtIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;        //s+(e-s)/2 =>  2s+e-s/2 => e+s/2
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //OrderDiagnosticsBinarySearch ->To Check Given Array is Ascending Order Or Descending Order

    public static int OrderDiagnosticsBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    //https://leetcode.com/problems/binary-search/description/
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = end - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //Ceiling of a given Number
    //Ceiling Number means,smalled element in array greater than or equal to target element

    public static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //if (target > arr.length - 1) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return start;
    }

    //Floor of a given Number
    //Floor Number means,smalled element in array less than or equal to target element

    public static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return end;
    }

    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    public static int[] searchFirstLastIndex(int[] num, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchIndex(num, target, true);
        ans[1] = searchIndex(num, target, false);
        return ans;
    }

    public static int searchIndex(int[] num, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static int findElementIndexInInfiniteArray(int[] nums, int taget) {
        int start = 0;
        int end = 1;
        while (taget > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return searchforInrinitsArrray(nums, start, end, taget);
    }

    public static int searchforInrinitsArrray(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = end - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
