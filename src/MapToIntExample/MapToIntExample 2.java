package MapToIntExample;

import java.util.Arrays;
import java.util.List;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Lakshman");
        int sum = names.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("sum :" + sum);
    }
}
