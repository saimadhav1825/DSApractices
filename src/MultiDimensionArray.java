import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public void getMultiArray() {
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
