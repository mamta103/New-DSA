package MapToIntExample;

import java.util.Arrays;
import java.util.List;

//Find Max Length of Strings
public class TotalCharacterCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        int totalChars =   words.parallelStream()
                .mapToInt(String::length)
                .sum();

        System.out.println(totalChars); // Output: 16
    }
}
// Output: 17
