package java8;

import java.util.Arrays;
import java.util.List;

public class IntergerNumberStartWithOne {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list  = Arrays.asList(12, 45, 67, 89, 90);
        
        // Convert each integer to a string and filter those that start with '1'
        List<String> listResult = list.stream()
                                      .map(s -> s + "")
                                      .filter(s -> s.startsWith("1"))
                                      .toList();
        
        // Print the filtered list of integers
        System.out.println(listResult);
    }
}
