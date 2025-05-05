package java100codes;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        String s1 = "abcsacd";
        Map<Character, Long> map = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity()
                , Collectors.counting()));

        Optional<Character> ch = map.entrySet().stream().filter(i -> i.getValue() == 1)
                .map(i -> i.getKey()).findFirst();

        System.out.println(ch);
    }
}
