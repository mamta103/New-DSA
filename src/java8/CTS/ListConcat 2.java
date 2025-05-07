package java8.CTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListConcat {
    public static void main(String[] args) {
        // Two sorted lists
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        // Merge lists using Streams and sort them
        List<Integer> resultList = Stream.concat(list1.stream(), list2.stream()).toList();

        // Print the merged sorted list
        System.out.println(resultList);


    }
}
