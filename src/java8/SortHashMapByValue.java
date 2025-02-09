package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {
        //Write a Program to sort hashmap by keys using Stream ?
        // Step 1: Create a HashMap with employee names as keys and IDs as values
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Alice", 101);
        employeeMap.put("Charlie", 103);
        employeeMap.put("Bob", 102);
        employeeMap.put("David", 104);

        // Step 2: Print the original HashMap
        System.out.println("Original HashMap: " + employeeMap);
        Map<String, Integer> resultMap = employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldvalue, newvalue)->oldvalue, LinkedHashMap::new));

        System.out.println("resultMap : "+resultMap);
    }
}
