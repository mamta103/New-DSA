package java8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 21, 18, 9, 12, 7);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 10) // Keep numbers > 10
                .distinct()          // Remove duplicates
                .sorted()            // Sort elements
                .limit(3)            // Take first 3
                .collect(Collectors.toList());
        System.out.println(result); // [12, 18, 21]
    }
}
