package UnmodifiableListExample;

import java.util.Arrays;
import java.util.List;

public class UnmodifiableListExampleJava9 {
    public static void main(String[] args) {
        List<String> ffruits = Arrays.asList("Apple", "Banana", "Cherry");// Immutable List
//        fruits.add("Mango"); // ❌ Throws UnsupportedOperationException
    }

}
//Output:  Exception in thread "main" java.lang.UnsupportedOperationException
