package dsalearn.linearsearch;

public class LinearSearchExamples {
    public static void main(String[] args) {

        int[] a = {12, 345, 2, 6, 7896};
        System.out.println(findEventDigitsInArray(a));

    }

    //search number in array
    static int linearSearch(int[] arr, int element) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) return i;
        }
        return -1;
    }

    //search char in string
    static int linearSearchInString(String input, char c) {
        if (input.isEmpty()) return -1;
        for (int i = 0; i < input.length(); i++) {
            if (c == input.charAt(i)) return i;
        }
        return -1;
    }

    //search number in array in particular range
    static int searchElementInParticular(int[] arr, int element, int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == element) return i;
        }
        return -1;
    }


    //find minimum number in array
    static int minimumInArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/ 1295
    //Find Numbers with Even Number of Digits
    static int findEventDigitsInArray(int[] arr) {
        if (arr.length == 0) return -1;
        int count = 0;
        for (int j : arr) {
            if (isEven(j)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int number) {
        if (number < 1) {
            number = number * -1;
        }
        if (number == 0) return false;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count % 2 == 0;
    }

    //https://leetcode.com/problems/richest-customer-wealth/description/1672

}
