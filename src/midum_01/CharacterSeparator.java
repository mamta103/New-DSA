package midum_01;

import java.util.ArrayList;
import java.util.List;

public class CharacterSeparator {
    public static void main(String[] args) {
        String s1 = "@mamta103kumari@gmail.com";

        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        List<Character> specialChars = new ArrayList<>();

        for (char ch : s1.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            } else if (Character.isDigit(ch)) {
                digits.add(ch);
            } else if (!Character.isWhitespace(ch)) {
                specialChars.add(ch);
            }
        }

        System.out.println("Letters: " + letters.stream().toList());
        System.out.println("Digits: " + digits.stream().toList());
        System.out.println("Special Characters: " + specialChars.stream().toList());
    }
}
