import java.util.Arrays;

public class LinearSearchProblem {

    public static void main(String[] args) {
        int[] arr = {10, 374, 38, 29, 2, 5, 8, 22};
        System.out.println(findMinNumber(arr));
        int[][] array = {{1, 5, 10, 7},
                {10, 3, 8, 9, 100},
                {1, 5, 40, 666, 7}
        };
        System.out.println(Arrays.toString(

                findNumIndexIn2DArray(array, 100)));
        System.out.println(

                findMazNum2DArray(array));
        System.out.println(

                findNumberOfEvenDigitsNumber(arr));
        System.out.println(

                findLargestWealthPersonIn2DArray(array));
    }

    static int findMinNumber(int[] arr) {
        int ans = arr[0];
        for (int out : arr) {
            if (out < ans) {
                ans = out;
            }
        }
        return ans;
    }

    static int[] findNumIndexIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int findMazNum2DArray(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > ans) {
                    ans = element;
                }
            }
        }
        return ans;
    }

    static int findNumberOfEvenDigitsNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (countDigits(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int countDigits(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    static int findLargestWealthPersonIn2DArray(int[][] arr) {
        //   int[] wealthOf = new int[arr.length];
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int total = 0;
            for (int anInt : ints) {
                total += anInt;
            }
            // wealthOf[row] = total;
            if (total > ans) {
                ans = total;
            }
        }
     /*   for (int i = 0; i < wealthOf.length; i++) {
            for (int j = i; j < wealthOf.length; j++) {
                if (wealthOf[i] > wealthOf[j]) {
                    int tem = wealthOf[i];
                    wealthOf[i] = wealthOf[j];
                    wealthOf[j] = tem;
                }
            }
        }*/
        // return wealthOf[wealthOf.length - 1];
        return ans;
    }
}
