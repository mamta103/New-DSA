package java8;

import java.util.Arrays;
import java.util.List;

public class SortListStringDecendingOrder {
    public static void main(String[] args) {
        // Step 1: Create a list of strings
        List<String> strings = Arrays.asList("on", "Shivam", "is", "Radhakrishna", "Rohit");

        // Step 2: Print the list before sorting
        System.out.println("Before Sorting ::");
        strings.forEach(System.out::println);

        // Step 3: Sort the list in descending order of string length
        List<String> resultStrings = strings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length()) // Sort by length in descending order
                .toList(); // Collect the sorted elements into a new list

        // Step 4: Print the list after sorting
        System.out.println("After Sorting ::");
        resultStrings.forEach(System.out::println);
    }
}