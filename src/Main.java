

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isArmStrongNumber(153));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if ((n % c == 0)) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    static boolean isArmStrongNumber(int num) {
        int sum = 0;
        int originalNum  = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        return originalNum == sum;
    }
}
