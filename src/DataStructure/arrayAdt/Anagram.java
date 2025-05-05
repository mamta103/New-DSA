package DataStructure.arrayAdt;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//        String s1 = new String(" CARE ");
//        String s2 = new String(" RACE ");

//        String s1 = new String(" evil ");
//        String s2 = new String(" vile ");

//        String s1 = new String(" hello ");
//        String s2 = new String(" hell ");

        String s1 = new String(" night ");
        String s2 = new String(" thingg ");


        anagramFunc(s1, s2);

    }

    private static void anagramFunc(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("//s", "");//replacing white spec with no space
        s2 = s2.toLowerCase().replaceAll("//s", "");

        if (s1.length() != s2.length()) {
            System.out.println("s1: " + s1 + "s2: " + s2 + " No strings are Anagram.");
            return;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println(s1 + ": " + s2 + " Yes strings are Anagram.");
        } else {
            System.out.println(s1 + ": " + s2 + " No strings are Anagram.");

        }


    }
}
