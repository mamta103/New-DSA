package java8.CTS;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3, 7, 1, 7, 2, 3, 8);
       List<Integer> result = numbers.stream().distinct().toList();
        System.out.println(result);
    }
}
