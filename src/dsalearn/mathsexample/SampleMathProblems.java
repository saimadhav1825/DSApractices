package dsalearn.mathsexample;

public class SampleMathProblems {
    public static void main(String[] args) {

        for (int i = 0; i <= 40; i++) {
            System.out.println(i + "---" + isPrime(i));
        }


    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }
}
