package dsalearn.linearsearch;

import java.util.Arrays;

public class LinearSearchInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println(Arrays.toString(findElementIntTwoDimensionalArray(arr, 70)));
        System.out.println(maxNumberTwoDimensionalArray(arr));
    }

    //element find in Two dimensional array

    static int[] findElementIntTwoDimensionalArray(int[][] arr, int element) {
        if (arr.length == 0) return new int[]{-1, -1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == element) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
    //max number find in Two dimensional array

    static int maxNumberTwoDimensionalArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) return max;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) max = arr[row][col];
            }
        }
        return max;
    }


}
