package MapToIntExample;

import java.util.Arrays;
import java.util.List;

//✅ Example 1: Sum of List of Integers
public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 9);
       int sum =  numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

    }
}
