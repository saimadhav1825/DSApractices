import java.util.Arrays;

public class BubbleSortProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{3, 9, 5, 6, 7, 8})));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
