package UnmodifiableListExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapExample {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 10);
        originalMap.put("Banana", 20);

        // Creating an unmodifiable Map
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(originalMap);
        System.out.println("Original Map: " + unmodifiableMap);


        Map<String, Integer> safeMap = new HashMap<>(unmodifiableMap);
        // Attempting to modify will throw UnsupportedOperationException
        safeMap.put("Cherry", 30);

        System.out.println("safeMap: "+safeMap);
    }
}
//Output : Exception in thread "main" java.lang.UnsupportedOperationException