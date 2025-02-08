package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Find the first element from the stream
       Optional<String> findFirst =  names.stream().findFirst();

        // Print the result
        findFirst.ifPresent(System.out::println);

    }
}
