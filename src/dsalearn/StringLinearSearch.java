package dsalearn;

public class StringLinearSearch {
    public static void main(String[] args) {
        String s = "Virat Kohli";
        System.out.println("Search If Character Found Return Boolean   " + searchCharacterInString(s, 'K'));
        System.out.println("Search If Character Found Return Index   " + searchCharacterIndex(s, 'K'));
        System.out.println("Search If Character Found Return Boolean   " + searchCharacterIfFoundBoolean(s, 'l'));

    }

    private static boolean searchCharacterInString(String s, Character c) {
        if (s.isEmpty()) return false;
        for (int i = 0; i <= s.length() - 1; i++) if (c == s.charAt(i)) return true;
        return false;
    }

    private static int searchCharacterIndex(String s, Character c) {
        if (s.isEmpty()) return -1;
        for (int index = 0; index <= s.length() - 1; index++) if (c == s.charAt(index)) return index;
        return Integer.MAX_VALUE;
    }

    //Without Index Using CharArray
    private static boolean searchCharacterIfFoundBoolean(String s, Character c) {
        if (s.isEmpty()) return false;
        for (char charAt : s.toCharArray()) if (c == charAt) return true;
        return false;
    }
}
