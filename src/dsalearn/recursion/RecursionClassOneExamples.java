package dsalearn.recursion;

public class RecursionClassOneExamples {
    public static void main(String[] args) {
        triangle(5, 0);
        triangle2(5,0);
    }

    static void questionOne(int n) {
        if (n == 0) return;
        System.out.println(n);
        questionOne(n - 1);
    }

    static void questionTwo(int n) {
        if (n == 0) return;
        questionTwo(n - 1);
        System.out.println(n);
    }

    static void questionThree(int n) {
        if (n == 0) return;
        System.out.println(n);
        questionThree(n - 1);
        System.out.println(n);
    }

    static int factorialOfNumber(int n) {
        if (n == 1) return n;
        return n * factorialOfNumber(n - 1);
    }

    static int sumOfAll(int n) {
        if (n <= 1) return n;
        return n + sumOfAll(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    static int sumOfMultiply(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * sumOfMultiply(n / 10);
    }

    static int sum = 0;

    static void reverseNumber(int n) {
        if (n == 0) return;
        int rem = n % 10;

        sum = sum * 10 + rem;
        reverseNumber(n / 10);
    }

    static boolean isPalindrome(int n) {
        return n == sum;
    }

    static int count = 0;

    static void findNumberOfZerosInNumber(int n) {
        if (n == 0) return;
        int rem = n % 10;
        if (rem == 0) count++;
        findNumberOfZerosInNumber(n / 10);
    }

    static int findNumberOfZerosInNumberOtherWya(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) return c;
        int rem = n % 10;
        if (rem == 0) return helper(n / 10, c + 1);
        return helper(n / 10, c);
    }

    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/1342
    int countas = 0;

    public int numberOfSteps(int num) {
        return numberOfStepsHelper(num, 0);
    }

    public int numberOfStepsHelper(int num, int c) {
        if (num == 0) return c;
        if (num % 2 == 0) {
            return numberOfStepsHelper(num / 2, c + 1);
        }
        return numberOfStepsHelper(num - 1, c + 1);
    }

    public static void triangle(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            System.out.print(" * ");
            triangle(r, c + 1);
        } else {
            System.out.println(" ");
            triangle(r - 1, 0);
        }
    }

    public static void triangle2(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print(" * ");
        } else {
            triangle2(r - 1, 0);
            System.out.println(" ");
        }
    }

}
