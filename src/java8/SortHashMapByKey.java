package java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByKey {
    public static void main(String[] args) {
        // Step 1: Create a HashMap with employee names as keys and IDs as values
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Alice", 101);
        employeeMap.put("Charlie", 103);
        employeeMap.put("Bob", 102);
        employeeMap.put("David", 104);

        // Step 2: Print the original HashMap
        System.out.println("Original HashMap: " + employeeMap);

        // Step 3: Sort the HashMap by keys using Streams
        Map<String, Integer> sortedMap = employeeMap.entrySet() // Get the entry set of the map
                .stream() // Create a stream of entries
                .sorted(Map.Entry.comparingByKey()) // Sort by keys (natural order)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Key mapper
                        Map.Entry::getValue, // Value mapper
                        (oldValue, newValue) -> oldValue, // Merge function (in case of duplicate keys)
                        LinkedHashMap::new // Use LinkedHashMap to preserve the order
                ));

        // Step 4: Print the sorted HashMap
        System.out.println("Sorted HashMap by Keys: " + sortedMap);
    }
}