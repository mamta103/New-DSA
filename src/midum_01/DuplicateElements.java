package midum_01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Long> map =
                list.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        List<String> duplicate = map.entrySet().stream().filter(v -> v.getValue() > 1)
                .map(k -> k.getKey()).toList();
        System.out.println(duplicate);
    }
}
