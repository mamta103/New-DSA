package MapToIntExample;

import java.util.Arrays;
import java.util.List;

//Find Max Length of Strings
public class MaxStringLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Lakshman");
        int maxLength = names.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("Max length = " + maxLength);
    }
}
