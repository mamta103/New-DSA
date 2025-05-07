package java100codes;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "mamtakumari";
        Map<Character, Long> map =
                input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        System.out.println(map);
        Optional<Character> result = map.entrySet().stream().filter(v -> v.getValue() == 1)
                .map(k -> k.getKey()).skip(1).findFirst();
        System.out.println(result);

    }
}
