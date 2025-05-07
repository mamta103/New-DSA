package java100codes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(101, "Alice");
        idNameMap.put(102, "Bob");
        idNameMap.put(103, "Charlie");
        idNameMap.put(104, "Diana");

        idNameMap.entrySet().stream().sorted().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1,e2)->e1, LinkedHashMap::new)
        );
        // Print the sorted map
        idNameMap.forEach((k, v) -> System.out.println("ID: " + k + ", Name: " + v));
    }
}
