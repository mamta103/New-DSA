package MapToIntExample;

import java.util.Arrays;
import java.util.List;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 25, 30);
        double avgNumer = numbers.stream().
                mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(avgNumer);


    }
}
