package dsalearn.javacodingquestionpracties;

public class ReverseAString {
    public static void main(String[] args) {

        reverseAString();

    }

    public static void reverseAString() {
        String s = "BeYourself";
        String out = "";
        for (int i = s.length() -1; i >=0; i--) {
            out = out + s.charAt(i);
        }
        System.out.println(out);
    }
}
