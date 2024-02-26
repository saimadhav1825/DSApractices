package leetCodeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringProblems {
    public static void main(String[] args) {
        String  s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    //Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.

    public static boolean validPlaindrome(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt += 32;
            }
            if (charAt >= 'a' && charAt <= 'z' || charAt >= '0' && charAt <= '9') {
                output.append(charAt);
            }
        }
        return output.toString().contentEquals(output.reverse());
    }

    // Reverse String
    //Write a function that reverses a string. The input string is given as an array of characters s.
    //
    //You must do this by modifying the input array in-place with O(1) extra memory.

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));

    }
    public static int lengthOfLastWord(String s) {

        String [] str = s.trim().split(" ");
        return str[str.length -1].length();

    }
}
