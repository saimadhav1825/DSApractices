public class BinarySearchProblem {
    //ascending order array

    public static void main(String[] args) {
        int[] ascendingOrder = {-10, -1, 0, 1, 5, 7, 9, 10, 17, 19};
        int target = 10;
        int out = ascendingOrderArray(ascendingOrder, target);
        // System.out.println(out);

        int[] orderAgnosticArray = {99, 90, 60, 66, 22, 11, 6, -1};
        int targetValue = -1;
        int outValue = orderAgnosticArray(orderAgnosticArray, targetValue);
        System.out.println(outValue);
    }

    private static int ascendingOrderArray(int[] ascendingOrder, int target) {
        int start = 0;
        int end = ascendingOrder.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > ascendingOrder[mid]) {
                start = mid + 1;
            } else if (target < ascendingOrder[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int orderAgnosticArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //Order Type means ascending or descending
            boolean type = arr[start] < arr[end];
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (type) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
