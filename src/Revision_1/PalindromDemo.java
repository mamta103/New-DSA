package Revision_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromDemo {
    public static void main(String[] args) {
        String s1 = "Madams";
        boolean isPalindrom = stringReverseFunc(s1);
        System.out.println(isPalindrom ? "Palindrom" : "Not Palindrom");

    }

    private static boolean stringReverseFunc(String sb) {
        String original = sb.toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();

        if(reverse.equalsIgnoreCase(sb)){
            return true;
        }
        else{
            return  false;
        }
    }
}
//Not Palindrom
