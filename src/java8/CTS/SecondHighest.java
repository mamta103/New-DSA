package java8.CTS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//1️⃣ Find the Second Highest Number in a List
public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 8);
        System.out.println("List With Sorting: " + numbers.stream().sorted().distinct().toList());
        Optional<Integer> result = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(result.get());


    }
}
