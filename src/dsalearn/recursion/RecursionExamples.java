package dsalearn.recursion;

public class RecursionExamples {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 6, 0, arr.length - 1));
    }

    static int fibonoci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonoci(n - 1) + fibonoci(n - 2);
    }

    static int binarySearch(int[] arr, int target, int star, int end) {
        if (star > end) {
            return -1;
        }
        int mid = star + (end - star) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, star, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
