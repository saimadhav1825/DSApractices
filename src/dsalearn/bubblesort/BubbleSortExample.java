package dsalearn.bubblesort;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean isSwap = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwap = true;
                }
            }

            if (!isSwap) break;
        }
    }
}
