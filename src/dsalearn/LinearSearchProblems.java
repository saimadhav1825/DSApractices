package dsalearn;

public class LinearSearchProblems {
    public static void main(String[] args) {

        //Linear Search with Unsorted Array
        int[] arr = {20, 1, 199,-7, 24, 9, 77, 66};
        System.out.println("Element Index    " + searchElementIndexIfContain(arr, 1));
        System.out.println("Element Return If Found   " + searchElementIfFoundElement(arr, 66));
        System.out.println("If Item Found Or Not  Return Boolean  " + searchElementIfFoundReturnBoolean(arr, 66));
        System.out.println("If Item Found Or Not  Return Index  " + searchItemWithInIndex(arr, -7, 1, 5));

    }

    //search in the array:if item found return index
    //if item not found return -1
    static int searchElementIndexIfContain(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return -1;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return index;
        return Integer.MAX_VALUE;
    }


    //search in the array:if item found return element
    //if item not found return -1
    static int searchElementIfFoundElement(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return -1;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return element;
        return Integer.MAX_VALUE;
    }

    //search in the array:if item found return true
    //if item not found return false
    static Boolean searchElementIfFoundReturnBoolean(int[] arr, int element) {
        //Search worst cose O(n)
        //Search Best Case O(1)
        if (arr.length == 0) return false;
        for (int index = 0; index <= arr.length - 1; index++) if (arr[index] == element) return true;
        return false;
    }

    //Search Item With In the Range from start and end index
    private static int searchItemWithInIndex(int[] arr, int item, int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = start; i <= end; i++) if (arr[i] == item) return i;
        return Integer.MAX_VALUE;
    }
}
