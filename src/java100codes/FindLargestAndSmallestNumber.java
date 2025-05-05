package java100codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLargestAndSmallestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 43, 22, 3, 4, 5);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);


        max.ifPresentOrElse(
                value -> System.out.println("Maximum: " + value),
                () -> System.out.println("List is empty!")
        );

        min.ifPresentOrElse(
                value -> System.out.println("Minimum: " + value),
                () -> System.out.println("List is empty!")
        );
    }
}