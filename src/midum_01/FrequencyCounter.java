package midum_01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//2️⃣ Count Frequency of Each Element in a List.
public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
