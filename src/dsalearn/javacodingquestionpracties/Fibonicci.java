package dsalearn.javacodingquestionpracties;

public class Fibonicci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonocci(i) + " ");

        }
    }

    public static int fibonocci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonocci(n - 1) + fibonocci(n - 2);
    }
}
