package dsalearn;

import java.util.Arrays;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] maxArray = {20, 1, 89, 7, 62};
        System.out.println("Max Number" + maxNumber(maxArray));
        swapNumber(1, 3);
        int[] arr={100,9,20,30,50,11,2};
        reverseArray(arr);
    }

    public static void swapNumber(int swapIndex, int swapChange) {
        int[] arr = {1, 10, 20, 35, 15};
        int temp = arr[swapIndex];
        arr[swapIndex] = arr[swapChange];
        arr[swapChange] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr == null || arr.length == 0) {
            return max;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array"+Arrays.toString(arr));
    }
}
