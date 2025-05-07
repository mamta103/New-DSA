package MapToIntExample;

import java.util.Arrays;

public class AnagramDemo {
    public static void main(String[] args) {
        String s1 = new String(" night ");
        String s2 = new String(" thing ");
        if (isAnagramFunc(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
        }
    }

    private static boolean isAnagramFunc(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (!s1.equals(s2)) {
            System.out.println("s1: " + s1 + "s2: " + s2 + " No strings are Anagram.");
        }
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);

    }

}


