package dsalearn.javacodingquestionpracties;


public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(primeNumber(27));

    }

    private static boolean primeNumber(int n) {

        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}
