package Revision_1;

import java.util.Arrays;

public class AnangramDemo {
    public static void main(String[] args) {
        String s1 = "Madam";
        String s2 = "Masdam";
        System.out.println("Is " + s1 + " an anagram of " + s2 + "? " + isAnagramFunc(s1, s2));
        boolean isAnangram = isAnagramFunc(s1, s2);
        System.out.println(isAnangram ? "Anagram" : "Not Anagram");


    }

    private static boolean isAnagramFunc(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        if (s1.length() != s2.length())
            return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Remove spaces
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

}