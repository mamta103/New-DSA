package sapient;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}
