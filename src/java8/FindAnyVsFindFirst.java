package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyVsFindFirst {
    public static void main(String[] args) {
        //Example with Parallel Stream
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using findAny() with parallel stream
      Optional<String> anyName=  names.parallelStream().findAny();
      anyName.ifPresent(name-> System.out.println("findAny() :  "+name));/// Output: Could be any element

      Optional<String> findFirst =   names.parallelStream().findFirst();
      findFirst.ifPresent(name-> System.out.println("findFirst() : "+findFirst));
    }
}
