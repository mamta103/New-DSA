package java100codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "bcabc";
        s.chars()
                .distinct()
                .sorted()
                .mapToObj(c -> String.valueOf(c))
                .collect(Collectors.joining());
        System.out.println(s);
    }
}
