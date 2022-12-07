import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30, 40},
                {11, 24, 32, 43},
                {14, 25, 35, 45},
                {15, 27, 38, 49}};
        System.out.println(Arrays.toString(searchElement(arr, 38)));
    }

    static int[] searchElement(int[][] arg, int target) {
        int r = 0;
        int c = arg.length - 1;
        while (r < arg.length && c >= 0) {
            if (arg[r][c] == target) {
                return new int[]{r, c};
            }
            if (arg[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
