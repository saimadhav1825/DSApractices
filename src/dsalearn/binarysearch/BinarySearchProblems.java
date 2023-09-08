package dsalearn.binarysearch;

public class BinarySearchProblems {
    public static void main(String[] args) {

        int[] ascArray = {-20, -5, -1, 0, 2, 3, 6, 7, 10, 1, 21, 5, 35, 67, 89};
        int[] dscArray = {100, 80, 66, 60, 50, 46, 42, 30, 25, 20, 18, 12, 2, 0, -2, -10, -20};
        System.out.println("Find Element Index In Binary Search" + findElementAtIndex(ascArray, 35));
        System.out.println("Find Element Index In Binary Search" + OrderDiagnosticsBinarySearch(dscArray, 60));
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
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if (target>nums[mid]){
                start=mid+1;
            }else  if (target<nums[mid]){
                end=end-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
