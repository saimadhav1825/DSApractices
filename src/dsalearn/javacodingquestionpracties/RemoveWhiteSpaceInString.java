package dsalearn.javacodingquestionpracties;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        removeWhiteSpaceInString();
    }

    public static void removeWhiteSpaceInString() {
        String s = "Be Your Self";
        StringBuilder out = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                out.append(c);
            }

        }
        System.out.println(out);
    }
}
