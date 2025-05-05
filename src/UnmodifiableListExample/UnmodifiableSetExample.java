package UnmodifiableListExample;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSetExample {
    public static void main(String[] args) {
        Set<String> originalSet = new HashSet<>();
        originalSet.add("Java");
        originalSet.add("Python");

        // Creating an unmodifiable Set
        Set<String> unmodifiableSet = Collections.unmodifiableSet(originalSet);

        // 1st approach to fix unsupported Excception
        Set<String> safeSet = new HashSet<>(unmodifiableSet);
        System.out.println("Original Set: " + unmodifiableSet);
        // Attempting to modify will throw UnsupportedOperationException
        safeSet.add("C++"); // ❌ Throws Exception


        //2ns Approached to fix unsupported exception
        try{
            unmodifiableSet.add("Cheery");
        }
        catch (UnsupportedOperationException ex){
            System.out.println("Modification not allowed on an unmodifiable map.");

        }
    }
}
