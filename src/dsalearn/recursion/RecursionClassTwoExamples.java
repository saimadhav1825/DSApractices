package dsalearn.recursion;

import java.util.ArrayList;

public class RecursionClassTwoExamples {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 9, 9, 6, 8, 10};
        ArrayList<Integer> list = new ArrayList<>();
        findAllTargetElement(arr, 9, 0, list);
        System.out.println(list);

    }

    public static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] < arr[index + 1] && isArraySorted(arr, index + 1);
    }

    public static boolean findTargetElement(int[] arr, int target, int index) {
        if (arr.length == index) return false;
        return arr[index] == target || findTargetElement(arr, target, index + 1);
    }

    public static int findTargetIndexElement(int[] arr, int target, int index) {
        if (arr.length == index) return -1;
        if (arr[index] == target) return index;
        else return findTargetIndexElement(arr, target, index + 1);
    }

    public static void findAllTargetElement(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (arr.length == index) return;
        if (arr[index] == target) list.add(index);
        findAllTargetElement(arr, target, index + 1, list);
    }
}
