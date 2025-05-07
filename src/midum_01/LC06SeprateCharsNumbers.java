package midum_01;

import java.util.LinkedList;
import java.util.List;

public class LC06SeprateCharsNumbers {
    public static void main(String[] args) {
        String s1 = "@mamta103kumari@gmail.com";
        List<Character> digits = new LinkedList<>();
        List<Character> letters = new LinkedList<>();
        List<Character> specialChars = new LinkedList<>();

        for (char ch : s1.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(ch);
            } else if (Character.isLetter(ch)) {
                letters.add(ch);
            } else if (!Character.isWhitespace(ch)) {
                specialChars.add(ch);
            }
        }
        System.out.println("digits:: " + digits);
        System.out.println("letters:: " + letters);
        System.out.println("specialChars:: " + specialChars);
    }
}
