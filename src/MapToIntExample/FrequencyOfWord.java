package MapToIntExample;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Map<String, Long> result = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);// {orange=1, banana=2, apple=2}

    }
}
