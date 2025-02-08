package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        // Find any element from the stream
       Optional<String> anyName =  names.stream().findAny();

        // Print the result
      anyName.ifPresent(System.out::println);
    }
}
