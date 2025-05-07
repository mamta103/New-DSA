package midum_01;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LC03RemoveDuplicate {
    public static void main(String[] args) {
        String input = "bcabcghjkyhnnnnnnn";
        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        List<Character> uniques = map.entrySet().stream().filter(v -> v.getValue() == 1).map(
                k -> k.getKey()).toList();
        System.out.println(uniques);
    }
}
