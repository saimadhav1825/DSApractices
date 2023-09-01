package dsalearn;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConcept {
    public static void main(String[] args) {
        twoDimensionalArray();
        /*Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(arr[1]);
        System.out.println("Before Scanner");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("After Scanner");
        System.out.println(Arrays.toString(arr));*/
    }

    public static void twoDimensionalArray() {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        for (int[] row : arr) {
            for (int anInt : row) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
