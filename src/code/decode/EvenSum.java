package code.decode;

import java.util.Arrays;
import java.util.List;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int evenSumResult = (int) numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).count();
        System.out.println(evenSumResult);
    }
}
