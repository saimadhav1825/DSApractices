package dsalearn;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        arrayExample();

    }

    public static void arrayExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input :");
        int num = scanner.nextInt();
        System.out.println(num);

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array Length :" + arr.length);
        System.out.println("Array Data" + Arrays.toString(arr));
    }
}
