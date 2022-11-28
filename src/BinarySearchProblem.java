public class BinarySearchProblem {
    //ascending order array

    public static void main(String[] args) {
        int[] ascendingOrder = {-10, -1, 0, 1, 5, 7, 9, 10, 17, 19};
        int target = 10;
        int out = ascendingOrderArray(ascendingOrder, target);
        // System.out.println(out);

       /* int[] orderAgnosticArray = {99, 90, 60, 66, 22, 11, 6, -1};
        int targetValue = -1;
        int outValue = orderAgnosticArray(orderAgnosticArray, targetValue);
        System.out.println(outValue);*/

      /*  int[] ceilingArray = {-10, -1, 0, 1, 5, 7, 9, 10, 17, 19};
        int ceilingTarget = 19;
        int ceilingOutValue = findCeilingNumber(ceilingArray, ceilingTarget);
        System.out.println(ceilingOutValue);*/

        int[] floorArray = {-10, -1, 0, 1, 5, 7, 9, 10, 17, 19};
        int floorTarget = -5;
        int floorOutValue = floorNumber(floorArray, floorTarget);
        System.out.println(floorOutValue);


        char[] charArray = {'a', 'c', 'd', 'k'};
        char charTarget = 'g';
        char charOutValue = findSmallestCharacterGreaterThanTarget(charArray, charTarget);
        System.out.println(charOutValue);
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

    //find the ceiling number
    //greater than >=target
    static int findCeilingNumber(int[] arr, int target) {
        //target=19;
        //int []={1,4,5,8,19,20,28};
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    //find the floor number
    //smallest no <=target
    static int floorNumber(int[] arr, int target) {
        //target=19;
        //int []={1,4,5,8,19,20,28};
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }

    //Find Smallest Letter Greater Than Target

    static char findSmallestCharacterGreaterThanTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return arr[start % arr.length];
    }
}
