package dsalearn.bitwiseoperators;

public class SampleBitwiseOperators {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
        findNonDuplicateNumberInArray();
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void findNonDuplicateNumberInArray() {
        int[] arr={2,4,5,2,4,5,6};
        System.out.println(uniqueNumber(arr));

    }

    public static int uniqueNumber(int[] n) {
        int unique = 0;
        for (int num : n) {
            unique ^= num;
        }
        return unique;
    }
}
