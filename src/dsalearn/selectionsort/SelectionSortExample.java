package dsalearn.selectionsort;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swapIndex(arr, max, last);
        }
    }

    private static void swapIndex(int[] arr, int first, int second) {
        int swap = arr[first];
        arr[first] = arr[second];
        arr[second] = swap;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) max = i;
        }
        return max;
    }

}
