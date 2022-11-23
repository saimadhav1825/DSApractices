import java.util.Arrays;

public class Problems2 {
    private static void printArray(int[] intList) {
        for (int j : intList) {
            System.out.println(j);
        }
    }

    private static void printOnyOdd(int[] intList) {
        int oddCount = 0;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] onlyOdd = new int[oddCount];
        int oddIndex = 0;
        for (int i = 0; i < intList.length; i++) {
            if (intList[i] % 2 != 0) {
                onlyOdd[oddIndex] = intList[i];
                oddIndex++;
            }
        }
        printArray(onlyOdd);
    }

    private static void reverseArray(int[] intList, int start, int end) {
        while (start < end) {
            int temp = intList[start];
            intList[start] = intList[end];
            intList[end] = temp;
            start++;
            end--;
        }
    }

    private static void minimumValue(int[] intList) {
        int min = intList[0];
        for (int i = 1; i < intList.length; i++) {
            if (intList[i] < min) {
                min = intList[i];
            }
        }
        System.out.println(min);
    }

    private static void secondLargestNumber(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }

    private static void moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println(temp.length);
    }

    private static void printMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        System.out.println(sum);
    }

    private static void checkPalindromeOrNot() {
        String name = "Madam";
        char[] input = name.toCharArray();
        StringBuilder out = new StringBuilder();
        for (int i = input.length - 1; i >= 0; i--) {
            out.append(input[i]);
        }
        if (name.equalsIgnoreCase(out.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
