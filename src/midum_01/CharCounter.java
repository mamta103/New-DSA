package midum_01;

import java.util.stream.Collectors;

public class CharCounter {
    public static void main(String[] args) {
        String s1 = "mamta123_kumari@134";

        String digitsOnly = s1.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String specialChars = s1.chars()
                .filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String specialCharString = s1.chars()
                .filter(c -> !Character.isLetter(c))
                .mapToObj(c -> String.valueOf((char) c))  // convert int to String
                .collect(Collectors.joining());

        System.out.println("Special characters: " + specialCharString);
        System.out.println("Special Character Count: " + specialCharString);
        System.out.println("Digits:: " + digitsOnly);
        System.out.println("specialChars:: "+specialChars);}
}
