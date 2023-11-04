package dsalearn.sort;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {5, 4, 2, 3, 1};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {5, 4, 2, 3, 1};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr1));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            boolean isSwaped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                    isSwaped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!isSwaped) break;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0, last);
            swapNumbers(arr,maxIndex,last);
        }
    }

    private static void swapNumbers(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    private static int maxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <=last; i++) {
            if (arr[max] < arr[i]) max = i;
        }
        return max;
    }

    private static void insertionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapNumbers(arr, j, j - 1);
                } else break;
            }
        }
    }

}
