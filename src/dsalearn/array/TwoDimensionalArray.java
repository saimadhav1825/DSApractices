package dsalearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        twoDimensionalArrayExample();

    }

    private static void twoDimensionalArrayExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row Count :");
        int rowCount = scanner.nextInt();
        System.out.print("Enter Column Count :");
        int colCount = scanner.nextInt();

        int[][] arr = new int[rowCount][colCount];

        //Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
        //Out Put
        for (int[] a : arr) {
            System.out.print(Arrays.toString(a));
            System.out.println();
        }

    }

}
