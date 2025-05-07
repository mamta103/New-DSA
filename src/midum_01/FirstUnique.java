package midum_01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//9️⃣ First Non-Repeated Element in a List
public class FirstUnique {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("MAMTA", "MAMTA", "MAMTA", "YADAV", "YADAV","VASU");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<String> result = map.entrySet().stream()
                .filter(value -> value.getValue() == 1)
                .map(key -> key.getKey()).findFirst();
        result.ifPresentOrElse(
                System.out::println, () -> System.out.println("No unique element found")
        );


    }
}
