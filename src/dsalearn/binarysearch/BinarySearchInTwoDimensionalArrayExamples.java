package dsalearn.binarysearch;

import java.util.Arrays;

public class BinarySearchInTwoDimensionalArrayExamples {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30}, {40, 50, 60}, {70, 80, 90}
        };
        System.out.println(Arrays.toString(binarySearchInTwoDimensionArray(arr, 60)));
    }

    public static int[] binarySearchInTwoDimensionArray(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                row++;
            } else col--;

        }
        return new int[]{-1, -1};
    }
}
