package MapToIntExample;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SumAndAverageDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(summaryStatistics.getMax());
    }
}
